package learn.java.treeset;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    
    public static void main(String args[]) {
		
		List<Integer> list = new LinkedList<>();
		list.add(21);
		list.add(32);
		list.add(44);
		list.add(11);
		list.add(54);
		
		TreeSet<Integer> set = new TreeSet<>(list);
		System.out.println("TreeSet elements in ascending order " + set);
        
        TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(21);
		set1.add(32);
		set1.add(44);
		set1.add(11);
		set1.add(54);
		System.out.println("TreeSet elements in ascending order " + set1);
		
		
		// This TreeSet will store the elements in reverse order.
		TreeSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
		reverseSet.add(21);
		reverseSet.add(32);
		reverseSet.add(44);
		reverseSet.add(11);
		reverseSet.add(54);
		System.out.println("TreeSet elements in descending order " + reverseSet);
	}
    
}
