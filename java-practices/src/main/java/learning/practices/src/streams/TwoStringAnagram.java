package learning.practices.src.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoStringAnagram {
	public static void main(String args[]) {
		String s1 = "RaceCar";
		String s2 = "CarRace";
		if(s1.length() != s2.length()) {
			System.out.println("Not an Anagram..");
			return;
		}
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		if (s1.equals(s2)) {
			System.out.println("It is Anagram.");
		} else {
			System.out.println("Not an Anagram.");
		}
	}
}
