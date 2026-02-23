package learning.practices.src.streams;

import java.util.Arrays;
import java.util.List;

public class ProgramOne {
	public static void main(String args[]) {
		int factor = 2;
		List<Integer> li = Arrays.asList(1, 2, 3, 4);
		li.stream().map(n -> n * factor).forEach(System.out::println);
	}
}
