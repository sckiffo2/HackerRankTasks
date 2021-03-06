package Arrays.Left_Rotation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
		int[] temp = Arrays.copyOfRange(a, 0, d);
		int[] result = new int[a.length];
		for (int i = d; i < a.length; i++) {
			result[i - d] = a[i];
		}
		for (int i = 0; i < temp.length; i++) {
			result[result.length - temp.length + i] = temp[i];
		}

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Corvin\\IdeaProjects\\Hackerrank\\InterviewPreparationKit\\src\\Arrays\\Left_Rotation\\out.txt"));

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] result = rotLeft(a, d);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
