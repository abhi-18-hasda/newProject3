package learning.practices.src.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionMethodDemo {
    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(1);
        arrayList.add(123);
        arrayList.add(72);
        arrayList.add(1);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("_______________________________________");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("D");
        arrayList2.add("B");
        arrayList2.add("Z");
        arrayList2.add("K");
        arrayList2.add("A");
        System.out.println(arrayList2);
        Collections.sort(arrayList2, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(arrayList2);
    }
}
