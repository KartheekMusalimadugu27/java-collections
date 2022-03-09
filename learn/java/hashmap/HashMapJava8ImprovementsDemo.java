package learn.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava8ImprovementsDemo {

    public static void main(String args[]) {

        Map<String, Integer> map = new HashMap<>();
        map.put("India", 5);
        map.put("USA", 3);
        map.put("China", 5);
        map.put("Russia", 6);

        /*
         * The compute(Key, BiFunction) method allows us to update a value in HashMap.
         * This method tries to compute a mapping for the specified key and its current
         * mapped value (or null if no current mapping is found). This method is used to
         * atomically update a value for a given key in HashMap.
         * 
         * If the remapping function passed in compute returns null, the mapping is
         * removed from the Map (or remains absent if initially absent).
         * If the remapping function throws an exception, the exception is rethrown, and
         * the current mapping is left unchanged.
         */

        // This will increment the value of India by 1 as it is present in the Map
        map.compute("India", (k, v) -> v == null ? 10 : v + 1);

        // This will insert Vietnam in the Map with default value of 10.
        map.compute("Vietnam", (k, v) -> v == null ? 10 : v + 1);

        System.out.println(map);

        /*
         * The computeIfAbsent(Key, Function) method of the HashMap class is used to
         * compute the value for a given key using the given mapping function and enter
         * that computed value in HashMap; otherwise, it’s null. Please note that the
         * computeIfAbsent() will work only if the key is not present or if the key is
         * present with a null value.
         */

        map.computeIfAbsent("Ukraine", k -> k.length());

        System.out.println(map);

        /*
         * The computeIfPresent(Key, BiFunction) method of the HashMap class allows you
         * to compute the value of mapping for a specified key if the key is already
         * associated with a value or is mapped to null.
         * 
         * If the mapping function of this method returns null, the mapping is removed.
         * If the remapping function throws an exception, the exception is rethrown, and
         * the mapping is left unchanged.
         */

        // This will increment the value of India by 1 as it is present in the Map
        map.computeIfPresent("India", (k, v) -> v == null ? 10 : v + 1);

        // This will not insert Vietnam in the Map.
        map.computeIfPresent("Vietnam", (k, v) -> v == null ? 10 : v + 1);

        System.out.println(map);

        /*
         * The merge() method#
         * The merge function can be used to merge two Maps. This method takes three
         * arguments:
         * 
         * key — The key that needs to be merged.
         * value — The value that needs to be inserted in case the key is not present.
         * remappingFunction — This is a BiFunction that is used to update the value if
         * the key is present.
         * We will begin to understand the working of this method using an example.
         * Let’s say we have two Maps in which the key is the name of a person and the
         * value is the amount of money that person has borrowed from us. It is possible
         * that a person is present in both the Maps. So, we need to merge these Maps to
         * find the total amount that each person has borrowed from us.
         */

         
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Jay", 5000);
		map1.put("Rahul", 3000);
		map1.put("Nidhi", 4500);
		map1.put("Amol", 60000);
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Jay", 7000);
		map2.put("Rahul", 4500);
		map2.put("Nidhi", 1200);
		map2.put("Saurav", 25000);
		
		map1.forEach((key,value) -> map2.merge(key, value, (v1, v2) -> v1 + v2));
		
		System.out.println(map2);

    }
}
