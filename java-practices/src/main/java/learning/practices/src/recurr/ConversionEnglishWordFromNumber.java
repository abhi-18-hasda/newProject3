package learning.practices.src.recurr;

public class ConversionEnglishWordFromNumber {
	public static void main(String args[]) {
		int number = 2019;
		convertIntoWords(number);
	}

	private static void convertIntoWords(int number) {
		if (number == 0) {
			return;
		}
		String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		int digit = number % 10;
		convertIntoWords(number / 10);
		System.out.print(words[digit] + " ");
	}
}
