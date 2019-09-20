package InterviewPreparationKit.Sorting.MergeSort;

import java.util.Arrays;

public class Solution {
	public static void mergeSort(int[] array) {
		mergeSort(array, 0, array.length - 1);
	}

	public static void mergeSort(int[] array, int start, int end) {
		if (end > start) {
			int middle = (start + end) / 2;
			mergeSort(array, start, middle);
			mergeSort(array, middle + 1, end);
			mergeHalves(array, start, middle, end);
		}
	}

	public static void mergeHalves(int[] array, int start, int middle, int end) {
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
		int[] array = {6, 1, 5, 3, 4, 2, 8, 7};
		System.out.println(Arrays.toString(array)); //visualisation
		mergeSort(array);
		System.out.println(Arrays.toString(array)); //visualisation
	}

	private static void test(int[] array) {
		int start = 0;
		int end = array.length - 1;
		int middle = (start + end) / 2;

		int[] lArray = Arrays.copyOfRange(array, start , middle + 1);
		int[] rArray = Arrays.copyOfRange(array, middle + 1 , end + 1);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(lArray));
		System.out.println(Arrays.toString(rArray));
	}
}
