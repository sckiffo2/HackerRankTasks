package InterviewPreparationKit.WarmUpChallenges.Find_pairs;

import java.io.*;
import java.util.*;

public class Solution {


	static int sockMerchant(int n, int[] ar) {
		int pairNumber = 0;
		byte[] sortedSocks = new byte[101];
		for (int a : ar) {
			sortedSocks[a]++;
		}
		for (int x : sortedSocks) {
			if (x != 0) {
				pairNumber += x / 2;
			}
		}

		return pairNumber;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
