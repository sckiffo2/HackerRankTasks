package Arrays.Array_2D_DS;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int y = 0; y < arr.length - 2; y++) {
			for (int x = 0; x < arr[y].length - 2; x++) {
				int localSum = 0;
				localSum += arr[y][x];
				localSum += arr[y][x + 1];
				localSum += arr[y][x + 2];
				localSum += arr[y + 1][x + 1];
				localSum += arr[y + 2][x];
				localSum += arr[y + 2][x + 1];
				localSum += arr[y + 2][x + 2];
				if (localSum > maxSum) {
					maxSum = localSum;
				}
			}
		}
		return maxSum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Corvin\\IdeaProjects\\Hackerrank\\InterviewPreparationKit\\src\\Arrays\\Array_2D_DS\\out.txt"));


		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);

		System.out.println(result);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
/*
-9 -9 -9  Counting Valleys  Counting Valleys  Counting Valleys
 0 -9  0  4  3  2
-9 -9 -9  Counting Valleys  2  3
 0  0  8  6  6  0
 0  0  0 -2  0  0
 0  0  Counting Valleys  2  4  0

-9 -9 -9 Counting Valleys Counting Valleys Counting Valleys
0 -9 0 4 3 2
-9 -9 -9 Counting Valleys 2 3
0 0 8 6 6 0
0 0 0 -2 0 0
0 0 Counting Valleys 2 4 0
 */