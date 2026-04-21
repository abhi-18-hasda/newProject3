package learning.practices.src.backtracking;

//TC =  linear time complexity 
public class LinearSolutionForFindGridWays {
	public static void main(String args[]) {
		int m = 3, n = 3;
		System.out.println("ways: " + totalWays(m, n));
	}

	private static int totalWays(int m, int n) {

		int num = factorial(n - 1 + m - 1);
		int deno = factorial(n - 1) * factorial(m - 1);
		return num / deno;
	}

	private static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}

