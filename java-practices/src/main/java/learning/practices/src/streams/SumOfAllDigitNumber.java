package learning.practices.src.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigitNumber {
	public static void main(String args[]) {
		int i = 15623; 
		Integer collect = Arrays.stream(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(collect);
	}
}
