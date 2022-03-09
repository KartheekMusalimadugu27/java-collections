package learn.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import learn.java.pojo.Employee1;

//Problem 1: Find employees aged over 50
//Problem 2: Find employees from the USA
//Problem 3: Sort employees by country
public class ArrayListExercise {
    
    public static void main(String args[]) {
		List<Employee1> list = new ArrayList<>();
		list.add(new Employee1("Alex", 23, "USA"));
		list.add(new Employee1("Dave", 34, "India"));
		list.add(new Employee1("Carl", 21, "USA"));
		list.add(new Employee1("Joe", 56, "Russia"));
		list.add(new Employee1("Amit", 64, "China"));
		list.add(new Employee1("Ryan", 19, "Brazil"));

        //Problem 1: Find employees aged over 50 using Java 8
        System.out.println("Name of employees with age more than 50 using Java 8");
        list.stream().filter(e -> e.age > 50).map(e -> e.name).forEach(System.out::println);

        //Problem 1: Find employees aged over 50 using Java 7
        System.out.println("Name of employees with age more than 50");
		for(Employee1 emp : list) {
			if(emp.age > 50) {
				System.out.println(emp.name);
			}
		}

        //Problem 2: Find employees from the USA
        System.out.println("Removing all employees who are from USA");
        ListIterator<Employee1> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            if(listIterator.next().country.equals("USA")){
                listIterator.remove();
            }
        }
        for (Employee1 emp : list) {
			System.out.println("Employee Name: " + emp.name + ", Employee Country: " + emp.country);
		}

        //Problem 3: Sort employees by country
        System.out.println("Sorting all the employees by country name");
		Collections.sort(list, (e1, e2) -> e1.country.compareTo(e2.country));

		for (Employee1 emp : list) {
			System.out.println("Employee Name: " + emp.name + ", Employee Country: " + emp.country);
		}
	}
		
	}

}
