package learning.practices.src.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestWordsFromList {
	public static void main(String args[]) {
		List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe", "zebra");
		Optional<String> optional = words.stream().max(Comparator.comparingInt(String::length));
		System.out.println(optional);
	}
}
