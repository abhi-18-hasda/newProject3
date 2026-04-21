package learning.practices.src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstEvenNumber {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		Optional<Integer> first = list.stream().filter(n->n%2==0).findFirst();
		System.out.println(first);
	}
}
