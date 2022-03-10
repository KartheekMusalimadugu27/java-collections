package learn.java.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSortByValues {

    //SortbyValuesMethod using Java7
    public static TreeMap<String, Integer> sortByValues(TreeMap<String, Integer> map) {
        Comparator<String> valueComparator = new Comparator<String>() {
            // return comparison results of values of two keys
            @Override
            public int compare(String k1, String k2) {
                int comp = map.get(k1).compareTo(map.get(k2));
                if (comp == 0) {
                    return 1;
                } else {
                    return comp;
                }
            }
        };
        TreeMap<String, Integer> mapSortedbyValues = new TreeMap<>(valueComparator);
        mapSortedbyValues.putAll(map);
        return mapSortedbyValues;
    }

    //SortbyValuesMethod using Java8
    public static TreeMap<String, Integer> sortByValuesJava8(TreeMap<String, Integer> map) {
        Comparator<String> valueComparator = (k1, k2) -> {

            int comp = map.get(k1).compareTo(map.get(k2));
            if (comp == 0)
                return 1;
            else
                return comp;
        };

        TreeMap<String, Integer> mapSortedByValues = new TreeMap<>(valueComparator);

        mapSortedByValues.putAll(map);
        return mapSortedByValues;

    }

    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 76);
        map.put("Novartis", 87);
        map.put("Google", 23);
        map.put("Audi", 101);

        System.out.println(sortByValues(map));
        System.out.println(sortByValuesJava8(map));

        
    }

}
