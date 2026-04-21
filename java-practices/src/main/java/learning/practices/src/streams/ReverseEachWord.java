package learning.practices.src.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWord {
	public static void main(String args[]) {
		String str = "Java Concept Of The Day";
		String collect = Stream.of(str.split(" ")).map(s-> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
		System.out.println(collect);
	}
}
