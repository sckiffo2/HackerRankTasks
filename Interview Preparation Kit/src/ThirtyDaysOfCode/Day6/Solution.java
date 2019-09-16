package ThirtyDaysOfCode.Day6;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int rowsNumber = Integer.parseInt(scan.nextLine());
		List<String> rowsList = new ArrayList<>();
		for (int i = 0; i < rowsNumber; i++) {
			rowsList.add(scan.nextLine());
		}

		for (String s : rowsList) {
			splitPrint(s);
		}
	}

	public static void splitPrint(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i % 2 == 0) {
				System.out.print(chars[i]);
			}
		}
		System.out.print(" ");
		for (int i = 0; i < chars.length; i++) {
			if (i % 2 != 0) {
				System.out.print(chars[i]);
			}
		}
		System.out.print(System.lineSeparator());
	}
}

