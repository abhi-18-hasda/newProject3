package learning.practices.src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumber {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		List<Integer> collect = list.stream().filter(n-> n%2 == 0).collect(Collectors.toList());
		System.out.println(collect);
	}
}
