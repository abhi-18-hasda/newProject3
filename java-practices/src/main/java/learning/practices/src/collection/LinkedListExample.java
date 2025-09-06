package learning.practices.src.collection;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String args[]) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(12);
        l.add(13);
        l.add(13);
        l.add(15);
        l.add(16);
        l.add(19);
        l.set(0,11);
        l.add(555);
        l.removeLast();
        l.remove(2);
        System.out.println(l);
    }
}
