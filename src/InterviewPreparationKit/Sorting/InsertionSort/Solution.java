package InterviewPreparationKit.Sorting.InsertionSort;

<<<<<<< HEAD
import org.junit.Assert;
import org.junit.Test;

public class Solution {
	public static void insertionSortImperative() {

	}

	public static void insertionSortRecursive() {

	}

	public static void main(String[] args) {

	}

	@Test
	public void speedTest() {

	}
=======
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void insertionSrot(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while(j > 0 && array[j] < array[j - 1]) {
                int temp = array[j];
                array[j] = array [j - 1];
                array [j - 1] = temp;
                j--;
                System.out.println(Arrays.toString(array));
            }
        }
    }
    
    public static void main(String[] args) {
        speedTest();
    }
    
    private static void speedTest() {
        int numbersLimit = 101;
        
        Random random = new Random();
        Instant time1 = Instant.now();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(numbersLimit);
        }
        System.out.println(Arrays.toString(array));
        Instant time2 = Instant.now();
        insertionSrot(array);
        Instant time3 = Instant.now();
        System.out.println(Arrays.toString(array));
    
    
        //System.out.println(Arrays.toString(array));
        System.out.format("Fill time: %d%n", (Duration.between(time1, time2).toMillis()));
        System.out.format("Sort time: %d%n", (Duration.between(time2, time3).toMillis()));
        System.out.format("Total time: %d%n", (Duration.between(time1, time3).toMillis()));
    }
    
>>>>>>> f0f04d2a448a5abcfa6bd4841b61d41aff2b9846
}
