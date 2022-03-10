package learn.java.arrays;

import java.util.Arrays;

public class ArraysBinarySearchDemo {
    
    public static void main(String args[]) {
    
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int index = Arrays.binarySearch(numbers, 4);

		System.out.println("The index of element 4 in the array is " + index);

        int index1 = Arrays.binarySearch(numbers, 5, 9, 4);

		System.out.println("The index of element 4 in the array is " + index1);

		index1 = Arrays.binarySearch(numbers, 1, 5, 4);

		System.out.println("The index of element 4 in the array is " + index1);

	}
}
