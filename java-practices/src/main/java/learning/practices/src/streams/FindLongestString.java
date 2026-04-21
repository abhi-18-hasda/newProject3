package learning.practices.src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindLongestString {
	public static void main(String args[]) {
		List<String> strings = Arrays.asList("apple", "banana", "orange","grape", "kiwi");
		Optional<String> maxValue = strings.stream().max((o1, o2)-> o1.length() - o2.length());
		System.out.println(maxValue);
	}
}
