package learning.practices.src.recurr;

public class FibonacciSeries {
	public static void main(String args[]) {
		int n = 10;
		System.out.println(fibo(n));
	}

	private static int fibo(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int ans = fibo(n - 1) + fibo(n - 2);
		return ans;
	}
}
