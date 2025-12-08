package learning.practices.src.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>((s1, s2)-> s1.compareTo(s2));
        map.put("Abhishek", 11);
        map.put("Rajat",44);
        map.put("Kundan", 32);
        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }
}
