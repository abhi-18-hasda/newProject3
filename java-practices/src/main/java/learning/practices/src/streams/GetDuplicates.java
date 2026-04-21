package learning.practices.src.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class GetDuplicates {
	public static void main(String args[]) {
		List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1); 
		HashSet<Integer> seen = new HashSet<>();
		List<Integer> uniqueNumber = duplicateNumbers.stream().filter(i -> !seen.add(i)).collect(Collectors.toList());
		uniqueNumber.forEach(System.out::println);
	}
}
