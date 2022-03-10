package learn.java.arrays;

import java.util.Arrays;

public class ArraysCopyDemo {

    public static void main(String[] args) {

        /*
         * If we need to create copies of our array, then we can use the copyOf() method
         * from the Arrays class. We need to provide the array that needs to be copied
         * and the new array’s size as a parameter.
         * 
         * The below example shows how to create a copy of an array where the copied
         * array size is the same as the original array. If the new array’s size is
         * greater than the original array, then the remaining positions are filled with
         * zeros.
         */

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] newArray = Arrays.copyOf(numbers, numbers.length);

		System.out.println("The copied array is: ");

		for (int i : newArray) {
			System.out.print(i + " ");
		}

		int[] newArrayBiggerSize = Arrays.copyOf(numbers, 20);
        System.out.println();
		System.out.println("The copied array is: ");

		for (int i : newArrayBiggerSize) {
			System.out.print(i + " ");
		}


        int[] newArray1 = Arrays.copyOfRange(numbers, 0, 5);

        System.out.println();
		System.out.println("The copied array is: ");

		for (int i : newArray1) {
			System.out.print(i + " ");
		}
	}

}


