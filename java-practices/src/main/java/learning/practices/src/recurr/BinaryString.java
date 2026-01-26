package learning.practices.src.recurr;

public class BinaryString {
	public static void main(String args[]) {
		printBinaryString(3, 0, "");
	}

	private static void printBinaryString(int n, int lastElement, String string) {
		if (n == 0) {
			System.out.println(string);
			return;
		}

		printBinaryString(n - 1, 0, string + "0");
		if (lastElement == 0) {
			printBinaryString(n - 1, 1, string + "1");
		}
	}
}
