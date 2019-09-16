package examples.test_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
//			iterator.remove(); // that cause java.lang.IllegalStateException
			int x = (int)iterator.next();
			System.out.println(x);

			if (x % 2 != 0) {
				iterator.remove();
			}
		}

		System.out.println(System.lineSeparator());
		System.out.println(System.lineSeparator());
		System.out.println(System.lineSeparator());

		iterator = list.iterator();
		while (iterator.hasNext()) {
			int x = (int)iterator.next();
			System.out.println(x);
		}
 	}
}
