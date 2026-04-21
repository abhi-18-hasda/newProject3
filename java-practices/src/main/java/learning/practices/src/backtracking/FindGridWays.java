package learning.practices.src.backtracking;

public class FindGridWays {
	public static void main(String args[]) {
		int m = 3;
		int n = 3;
		int ways = findWays(0, 0, m, n);
		System.out.println("Total ways: " + ways);
	}

	private static int findWays(int i, int j, int m, int n) {

		if (i == n - 1 || j == m - 1) { // cond for last cell
			return 1;
		} else if (i == n || j == m) { // boundry cross conditions
			return 0;
		}
		int w1 = findWays(i + 1, j, m, n);
		int w2 = findWays(i, j + 1, m, n);
		return w1 + w2;
	}
}
