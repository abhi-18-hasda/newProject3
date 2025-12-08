package learning.practices.src.collection;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class WeakMaps {
    public static class Phone {
        private String brand;
        private int price;

        public Phone(String brand, int price) {
            this.brand = brand;
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public int getPrice() {
            return price;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Phone [brand=" + brand + ", price=" + price + ", toString()=" + super.toString() + "]";
        }

    }

    public static void main(String[] args) {
        // Phone p1 = new Phone("samsung", 49000);
        WeakReference<Phone> whp = new WeakReference<>(new Phone("samsung", 49000));
        System.out.println("Before GC: " + whp.get());

        System.gc();
        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {
        }

        System.out.println("After GC: " + whp.get());
    }
}
