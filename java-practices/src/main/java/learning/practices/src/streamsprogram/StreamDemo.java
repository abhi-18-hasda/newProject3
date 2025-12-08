package learning.practices.src.streamsprogram;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> functionDouble = x -> x * x;
        Consumer<Integer> consume = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;
        if (predicate.test(supplier.get())) {
            consume.accept(functionDouble.apply(supplier.get()));
        }

    }
}
