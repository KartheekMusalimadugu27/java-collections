package learn.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListSortDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

		list.add(34);
		list.add(12);
		list.add(9);
		list.add(76);
		list.add(29);
		list.add(75);
		Collections.sort(list);
		System.out.println("ArrayList in asc order: " + list);

		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List "+sortedList);


        //Sorting in Reverse Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reverse Order 1st way "+list);

        //Reverse using Streams
        List<Integer> reverseSort = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSort);

    }
    
    

}
