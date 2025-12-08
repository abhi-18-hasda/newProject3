package learning.practices.src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.oracle.truffle.api.impl.TVMCI.Test;

public class PredicateDemo {

    int x = 40;

    Predicate<Integer> predicate = n -> n % 2 == 0;

    Function<Integer, Integer> db = n -> 2 *x;

    Supplier<String> words = () -> "hello world";

    static long fact(int n){
         if (n == 0 || n == 1) {
        return 1;   // base case
    }
    return n * fact(n - 1); 
    }
    public static void main(String[] args) {
        PredicateDemo demo = new PredicateDemo();

        // Test predicate
        System.out.println(demo.predicate.test(40));  // true
        System.out.println(demo.predicate.test(15));  // false
        System.out.println(demo.db.apply(2));
        System.out.println(demo.words.get());

        List<String> stu = Arrays.asList("Rajendra","Abhishek", "Sam", "kuldip");
        //stu.forEach(x-> System.out.println(x));
        //stu.forEach(System.out::println);
        //stu.stream().map(x->x.toUpperCase()).forEach(System.out:: println);
        //stu.stream().sorted().forEach(System.out::println);
        stu.stream().filter(x->x.length()>3).forEach(System.out::println);



        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7);
        // li.stream().filter(x->x%2 == 0)
        // .forEach(System.out:: println);

       // li.stream().skip(1).collect(Collectors.toList()).forEach(System.out::println);
       System.out.println(li.stream().reduce(Integer::sum).get());
       AtomicInteger sum = new AtomicInteger(0);
       List<Integer> lis = li.stream()
       .map(x->sum.addAndGet(x))
       .collect(Collectors.toList());
       System.out.println(lis);

      List<List<String>> listStr = Arrays.asList(Arrays.asList("Abhishek", "sumit"), Arrays.asList("bhumi", "anupam"));
      System.out.println(listStr.stream().flatMap(x->x.stream()).map(String::toLowerCase).sorted().collect(Collectors.toList()));

    }
}
