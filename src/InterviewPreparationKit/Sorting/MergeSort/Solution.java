package InterviewPreparationKit.Sorting.MergeSort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class Solution {
	private static void mergeSort(int[] array) {
		mergeSort(array, 0, array.length - 1);
	}

	private static void mergeSort(int[] array, int start, int end) {
		if (end > start) {
			int middle = (start + end) / 2;
			mergeSort(array, start, middle);
			mergeSort(array, middle + 1, end);
			mergeHalves(array, start, middle, end);
		}
	}

	private static void mergeHalves(int[] array, int start, int middle, int end) {
		int[] lArray = Arrays.copyOfRange(array, start , middle + 1);
		int[] rArray = Arrays.copyOfRange(array, middle + 1 , end + 1);

		int i = 0;
		int j = 0;
		int k = start;

		while (i < lArray.length && j < rArray.length) {
			if (lArray[i] <= rArray[j]) {
				array[k] = lArray[i];
				i++;
			} else {
				array[k] = rArray[j];
				j++;
			}
			k++;
		}

		while (i < lArray.length) {
			array[k] = lArray[i];
			i++;
			k++;
		}

		while (j < rArray.length) {
			array[k] = rArray[j];
			j++;
			k++;
		}
		//System.out.println(Arrays.toString(array)); //visualisation
	}

	public static void main(String[] args) {
//		int[] array = {6, 1, 5, 3, 4, 2, 8, 7};
//		System.out.println(Arrays.toString(array)); //visualisation
//		mergeSort(array);
//		System.out.println(Arrays.toString(array)); //visualisation

		speedTest();
	}

	private static void speedTest() {
		int numbersLimit = 10001;

		Random random = new Random();
		Instant time1 = Instant.now();
		int[] array = new int[100_000_000];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(numbersLimit);
		}

		Instant time2 = Instant.now();
		mergeSort(array);
		Instant time3 = Instant.now();

		//System.out.println(Arrays.toString(array));
		System.out.format("Fill time: %d%n", (Duration.between(time1, time2).toMillis()));
		System.out.format("Sort time: %d%n", (Duration.between(time2, time3).toMillis()));
		System.out.format("Total time: %d%n", (Duration.between(time1, time3).toMillis()));
	}
}
