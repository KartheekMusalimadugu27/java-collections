package learn.java.hashset;

import java.util.HashSet;

//You are given an array in which all the elements are unique except one element. You need to find the duplicate element.
//For example, the array is {12, 34, 1, 56, 43, 34, 65}
//The output should be 34 since it is the only duplicate element.
//This problem should be done in O(n)
//complexity, and the array is not sorted.
public class HashSetExercise {
    public static void main(String args[]) {
        int[] data = { 12, 34, 1, 56, 43, 34, 65 };
        int duplicate = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        // Your logic will go here
        for (int i : data) {
            if (!hashSet.add(i)) {
                duplicate = i;
                break;
            }
        }

        System.out.println(duplicate);
    }
}
