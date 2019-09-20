package InterviewPreparationKit.Sorting.CountingSort;


import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Solution {

	private static void countingSort(int[] array, int numbersLimit) {
		int[] calcArray = new int[numbersLimit];
		Arrays.fill(calcArray, 0);

		for (int e: array) {
			calcArray[e]++;
		}

		int index = 0;
		for (int i = 0; i < calcArray.length; i++) {
			while (calcArray[i] > 0) {
				array[index++] = i;
				calcArray[i]--;
			}
		}
	}

	public static void main(String[] args) {
		int numbersLimit = 100000001;

		Random random = new Random();
		Instant time1 = Instant.now();
		int[] array = new int[100_000_000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(numbersLimit);
		}

		Instant time2 = Instant.now();
		countingSort(array, numbersLimit);

		Instant time3 = Instant.now();

		//System.out.println(Arrays.toString(array));
		System.out.format("Fill time: %d%n", (Duration.between(time1, time2).toMillis()));
		System.out.format("Sort time: %d%n", (Duration.between(time2, time3).toMillis()));
		System.out.format("Total time: %d%n", (Duration.between(time1, time3).toMillis()));
	}
}
