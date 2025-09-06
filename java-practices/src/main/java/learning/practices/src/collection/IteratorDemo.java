package learning.practices.src.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<=20;i++) {
            arr.add(i);
        }
        Iterator<Integer> ir = arr.iterator();
        while(ir.hasNext()) {
            Integer integer = (Integer)ir.next();
            if(integer%2 ==0) {
                System.out.println(integer);
            }else {
                ir.remove();
            }
        }
    }

}
