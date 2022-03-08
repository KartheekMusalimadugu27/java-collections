package learn.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListForLoopDemo {
    
    public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		 
		for (int i = 0; i < list.size(); i++) { //Simple for loop
			System.out.println(list.get(i));
		}

		for (Integer i : list) {   //Enhanced for loop
			System.out.println(i);
		}

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }

        // Iterating using forEachRemaining() method
        // Iterating using forEachRemaining() method
		System.out.println("Iterating using forEachRemaining() method");
		Iterator<Integer> newItr = list.iterator();
        newItr.forEachRemaining(e -> System.out.println(e));

		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext()) {
			int next = itr.next();
			if(next == 30) {
				itr.remove();
			}
		}
		System.out.println(list);

		// Getting ListIterator
		ListIterator<Integer> listIterator = list.listIterator();

		// Traversing elements
		System.out.println("Forward Direction Iteration:");
		while (listIterator.hasNext()) {
			System.out.println("Next element is " + listIterator.next() + 
			" and next index is " + listIterator.nextIndex());
			
		}

		// Traversing elements, the iterator is at the end at this point
		System.out.println("Backward Direction Iteration:");
		while (listIterator.hasPrevious()) {
			System.out.println("Previous element is " + listIterator.previous() + 
			" and previous index is " + listIterator.previousIndex());
		}

	}

}
