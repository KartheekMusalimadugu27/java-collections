package learn.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import learn.java.pojo.Vehicle;

public class ArrayListComparatorDemo {
    
public static void main(String[] args) {
    
    List<Vehicle> list = new ArrayList<>();
    list.add(new Vehicle("Volkswagen", 2010));
    list.add(new Vehicle("Audi", 2009));
    list.add(new Vehicle("Ford", 2001));
    list.add(new Vehicle("BMW", 2015));

    System.out.println("Sorting by brand name");
    Collections.sort(list,new Comparator<Vehicle>() {

        @Override
        public int compare(Vehicle o1, Vehicle o2) {
            return o1.brand.compareTo(o2.brand);
        }
    });

    for (Vehicle vehicle : list) {
        System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makeYear);
    }

    System.out.println("Sorting by make year");
		Collections.sort(list, (o1,o2) -> o1.makeYear.compareTo(o2.makeYear));
		for (Vehicle vehicle : list) {
			System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makeYear);
		}

        

}

}
