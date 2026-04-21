package learning.practices.src.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
	public static void main(String args[]) {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		List<String> dataSort = listOfStrings.stream().sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		dataSort.forEach(System.out::println);
	}
}
