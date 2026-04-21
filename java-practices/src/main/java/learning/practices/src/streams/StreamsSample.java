package learning.practices.src.streams;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsSample {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 1, 4, 5);
		Set<Integer> seen = new LinkedHashSet<Integer>();
		List<Integer> uniqueNumber = list.stream().filter(seen::add).collect(Collectors.toList());
		uniqueNumber.forEach(System.out::println);
	}
}
