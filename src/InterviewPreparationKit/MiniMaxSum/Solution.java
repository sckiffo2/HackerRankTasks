package InterviewPreparationKit.MiniMaxSum;

import java.util.*;

public class Solution {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		long sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println((sum - max) + " " + (sum - min));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}