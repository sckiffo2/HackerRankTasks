package examples.ForeachLambda;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.forEach((a, b) -> System.out.println("Key:	" + a + "	Value:	" + b));




		Arrays.asList("a", "b", "c").forEach(System.out::println);

		int i = 0;
		Optional<String> firstName = Optional.ofNullable(null); //
		System.out.println(firstName);
		System.out.println(firstName.isPresent());
		System.out.println(firstName.orElse("none"));
		System.out.println(firstName.orElseGet( () -> System.lineSeparator() + " really nothing"));
		System.out.println(firstName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );


	}
}
