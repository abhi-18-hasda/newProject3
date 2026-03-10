package learning.practices.src.backtracking;

public class FindSubsetPractics {
	public static void main(String args[]) {
		String str = "abc";
		findSubset(str, 0, "");
	}

	private static void findSubset(String str, int i, String ans) {
		// base case
		if (str.length() == i) {
			System.out.println(ans);
			return;
		}
		// yes
		findSubset(str, i + 1, ans + str.charAt(i));
		// no
		findSubset(str, i + 1, ans);
	}
}
