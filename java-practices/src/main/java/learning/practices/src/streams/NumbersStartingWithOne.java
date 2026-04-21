package learning.practices.src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithOne {
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(10, 12, 20, null, 19, 30);
		List<Integer> startWithOne = numbers.stream().filter(i -> String.valueOf(i).startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(startWithOne);
	}
}
