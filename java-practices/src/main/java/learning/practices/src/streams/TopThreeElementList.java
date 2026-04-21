package learning.practices.src.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopThreeElementList {
	public static void main(String args[]) {
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		List<Integer> collect = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3)
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
	}
}
