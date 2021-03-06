package InterviewPreparationKit.WarmUpChallenges.Counting_Valleys;

import java.io.*;
import java.util.*;

public class Solution {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		int valleys = 0;
		int level = 0; // above see
		char[] path = s.toCharArray();
		for (char c : path) {
			if (c == 'D') {
				level--;
			} else if (c == 'U') {
				level++;
				if (level == 0) {
					valleys++;
				}
			}
		}
		return valleys;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

