package learn.java.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

    public static void main(String args[]) {
        Set<Integer> set = new HashSet<>();

        System.out.println("Inserting 23 in the HashSet:  " + set.add(23));
        System.out.println("Inserting 34 in the HashSet:  " + set.add(34));
        System.out.println("Inserting 23 in the HashSet:  " + set.add(23));

        System.out.println(set);

        System.out.println(set.contains(23));

        set.remove(23);

        System.out.println("HashSet after removing one element" + set);

        set.clear();

        System.out.println("HashSet after removing all elements" + set);

        System.out.println(set.isEmpty());

        set.add(23);
        set.add(34);
        set.add(56);

        // Creating an ArrayList from existing set.
        List<Integer> list = new ArrayList<>(set);
        // Sorting the list.
        Collections.sort(list);

        list.forEach(System.out::println);

    }

}
