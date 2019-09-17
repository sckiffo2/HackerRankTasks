package InterviewPreparationKit.Sorting.MarkAndToys;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the maximumToys function below.
	static int maximumToys(int[] prices, int k) {
		int toys = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = prices.length - 1; j > 0 ; j--) {
				if (prices[j] < prices[j - 1]) {
					int temp = prices[j - 1];
					prices[j - 1] = prices[j];
					prices[j] = temp;
				}
			}
			if (prices[i] <= k) {
				k -= prices[i];
				toys++;
			} else {
				break;
			}
		}
		return toys;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] prices = new int[n];

		String[] pricesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int pricesItem = Integer.parseInt(pricesItems[i]);
			prices[i] = pricesItem;
		}

		int result = maximumToys(prices, k);

		System.out.println(result);
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();
	}
}
