package learn.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import learn.java.pojo.Employee;

public class ArrayListComparableDemo {

    public static void main(String[] args) {
        
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Jane", 29));
		list.add(new Employee("Alex", 54));
		list.add(new Employee("Matt", 19));
		list.add(new Employee("Roy", 72));

        Collections.sort(list);
		list.forEach(e -> System.out.println("Emp Name is "+e.name+"and Age is "+e.age));

    }
    
}
