package learning.practices.src.recurr;

public class LengthOfString {
	public static void main(String args[]) {
		String str = "abcd";
		System.out.println(printLength(str));
	}

	private static int printLength(String str) {
		if (str.length() == 0) {
			return 0;
		}
		return printLength(str.substring(1)) + 1;
	}
}
