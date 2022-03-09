package learn.java.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

        
		list.add(4);  // This will add 4 at the end of the List.
		System.out.println(list);
		
		list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
		System.out.println(list);

		List<Integer> newList = new ArrayList<>();; // Creating a new List which will be added to original list.
		newList.add(150);
		newList.add(160);

		list.addAll(newList); // This will add all the elements present in newList to list.
		System.out.println(list);

        System.out.println("The element at index two is " + list.get(1));

		System.out.println("The size of the List is  " + list.size());

        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		
		System.out.println(list1);

        list1.remove(1);  // This will remove the element at index 1 i.e 20.
		System.out.println(list1);

        list1.remove(Integer.valueOf(30)); // This will remove 30 from the list
		System.out.println(list1);
        
        list1.clear(); //This will remove all the elements from the list.
		System.out.println(list1);

        List<String> stringList = new ArrayList<String>();
        stringList.add("Apple");
        stringList.add("Banana");

        stringList.replaceAll(element -> element.toUpperCase());

        System.out.println(stringList);

        List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(10);

		intList.set(1, 100);

    System.out.println(intList);

		if (intList.contains(30)) {
			System.out.println("List contains 30");
		}

		System.out.println("Index of first occurence of 10 is " + intList.indexOf(10));
		System.out.println("Index of last occurence of 10 is " + intList.lastIndexOf(10));


    }

    
    

}
