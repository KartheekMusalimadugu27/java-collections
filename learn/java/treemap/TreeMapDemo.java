package learn.java.treemap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        // Creating a TreeMap which will store all the elements in reverse order.
        TreeMap<String, Integer> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.put("Oracle", 43);
        reverseMap.put("Microsoft", 56);
        reverseMap.put("Apple", 43);
        reverseMap.put("Novartis", 87);
        System.out.println("Elements are stored in reverse order: " + reverseMap);

        // Creating a HashMap which will store all the elements in random order.
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Oracle", 43);
        hashMap.put("Microsoft", 56);
        hashMap.put("Apple", 43);
        hashMap.put("Novartis", 87);
        System.out.println("Elements are stored in random order: " + hashMap);

        // Creating a TreeMap using existing HashMap. This will store the elements in
        // ascending order.
        TreeMap<String, Integer> treeMap1 = new TreeMap<>(hashMap);
        System.out.println("Elements are stored in ascending order: " + treeMap1);

        // Creating a TreeMap using existing TreeMap. This will store the elements in
        // the same order as it was in the passed Map.
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(reverseMap);
        System.out.println("Elements are stored in descending order: " + treeMap2);

        // Fetching the first entry in the Map.
        Entry<String, Integer> firstEntry = treeMap1.firstEntry();

        System.out.println("Smallest key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());

        // Fetching the last entry in the Map.
        Entry<String, Integer> lastEntry = treeMap1.lastEntry();
        System.out.println("Largest key: " + lastEntry.getKey() + ", Value: " + lastEntry.getValue());

        System.out.println("Removing Oracle from Map. This will return the value corresponding to Oracle: "
                + treeMap1.remove("Oracle"));
        System.out.println("Removing Google from Map. This will return null as Google is not present in the Map: "
                + treeMap1.remove("Google"));
                
    }

}
