package learning.practices.src.collection;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> li = new ArrayList<>();
        li.add(new Student("SuAbhishek", 23.0f));
        li.add(new Student("Zmit", 55.0f));
        li.add(new Student("Ramesh", 89.0f));
        li.sort(null);
        System.out.println(li);
    }
}
