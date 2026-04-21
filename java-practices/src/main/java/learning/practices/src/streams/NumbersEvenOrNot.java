package learning.practices.src.streams;

import java.util.Arrays;
import java.util.List;

public class NumbersEvenOrNot {
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
		// boolean isEvenAll = numbers.stream().allMatch(i -> i % 2 == 0);
		// anyMatch
		// boolean isEvenAll = numbers.stream().anyMatch(i -> i % 2 == 0);
		// noneMatch
		// List<Integer> numbers = Arrays.asList(1,3,5,7);
//		boolean isEvenAll = numbers.stream().anyMatch(i -> i % 2 != 0);
//		System.out.println("All numbers: " + isEvenAll);

		List<String> nameList = Arrays.asList("Banana", "Apple", "Cat", "Andrew");
		boolean result = nameList.stream().anyMatch(s -> s.startsWith("K"));
		System.out.println("Result: " + result);
	}
}
