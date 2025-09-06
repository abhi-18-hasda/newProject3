package learning.practices.src.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]) {
        TreeSet set = new TreeSet<>(new MyComparator());
        set.add(12);
        set.add(22);
        set.add(42);
        set.add(32);
        set.add(52);
        set.add(37);
        set.add(18);
        set.add(11);
        set.add(10);
        System.out.print(set+", ");
    }

}
class MyComparator implements Comparator<Object>{
    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer)obj1;
        Integer i2 = (Integer)obj2;
        if(i1>i2) {
            return -1;
        }else if(i1< i2){
            return 1;
        }
        return 0;
    }
}