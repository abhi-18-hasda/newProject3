package learning.practices.src.collection;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<Integer, String> whp = new WeakHashMap<>();
        whp.put(new Integer(101),"Abhishek");
        whp.put(new Integer(202), "Amit");

        applicationRunning(whp);
    }

    private static void applicationRunning(WeakHashMap<Integer, String> whp) {
        System.out.println("Before GC: " + whp);
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {
        }

        System.out.println("After GC: " + whp);
    }
}
