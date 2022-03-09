package learn.java.treeset;

import java.util.TreeSet;

//Problem 1: Numbers greater than 50
//Problem 2: Smallest and largest number in array
public class TreeSetExercise {

    public static void main(String args[]) {

        int[] numbers = { 1, 4, 5, 2, 34, 66, 5, 4, 33, 45, 6, 8, 56, 76, 78, 98, 34, 37, 12, 12, 23, 43, 54, 56 };

        // Problem 1: Numbers greater than 50
        TreeSet<Integer> treeset = new TreeSet<Integer>();
        for (int i : numbers) {
            treeset.add(i);
        }
        System.out.println(treeset.tailSet(Integer.valueOf(50)));
        System.out.println(treeset.first());
        System.out.println(treeset.last());

    }

}
