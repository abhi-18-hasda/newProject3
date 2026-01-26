package learning.practices.src.recurr;

public class CountSameElementStartAndEnd {
	public static void main(String args[]) {
		String str = "abcab";
		System.out.println(CountSameElement(str, 0, str.length() - 1, str.length()));
	}

	private static int CountSameElement(String str, int i, int j, int length) {

		if (length == 1) {
			return 1;
		}
		// for no valid string
		if (length <= 0) {
			return 0;
		}
		// rules: first remove from letf
		// remove from right
		// remove from both the side overlap
		int res = CountSameElement(str, i + 1, j, length - 1) + CountSameElement(str, i, j - 1, length - 1)
				- CountSameElement(str, i + 1, j - 1, length - 2);
		if (str.charAt(i) == str.charAt(j)) {
			res++;
		}
		return res;
	}
}
