package examples.test_Comparator;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Umesh Awasthi", 35));
		persons.add(new Person("Robert Hickle", 55));
		persons.add(new Person("John Smith", 40));
		persons.add(new Person("Adam Smith", 40));
		persons.add(new Person("David", 63));
		persons.add(new Person("David", 23));

		System.out.println("###DefaultComparator####################################");
		Collections.sort(persons);
		println(persons);

		System.out.println("###AnonymousComparator##################################");
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person person1, Person person2) {
				int name = person1.getName().compareTo(person2.getName());
				if (name == 0) {
					return Integer.compare(person1.getAge(), person2.getAge());
				}
					return name;
			}
		});
		println(persons);

		System.out.println("###Java8-Comparator#####################################");
		persons.sort(Comparator.comparingInt(Person::getAge).reversed().thenComparing(Person::getName));
		println(persons);

		System.out.println("###LambdaComporator#####################################");
		Collections.sort(persons, (a, b) -> b.compareTo(a));
		println(persons);


	}

	private static void println(List<Person> persons) {
		for (Person p : persons) {
			System.out.println(p);
		}
	}
}
