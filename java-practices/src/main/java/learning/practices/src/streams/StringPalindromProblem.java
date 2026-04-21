package learning.practices.src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringPalindromProblem {
	public static void main(String args[]) {
		List<String> palindromeNames = Arrays.asList("Telugu", "Tamil", "Malayalam");
		List<String> collect = palindromeNames.stream().filter(s -> {
			return s.toLowerCase().contentEquals(new StringBuilder(s.toLowerCase()).reverse());
		}).collect(Collectors.toList());
		System.out.println(collect);
	}
}
