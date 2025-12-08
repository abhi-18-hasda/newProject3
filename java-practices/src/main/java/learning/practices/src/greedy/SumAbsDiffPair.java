package learning.practices.src.greedy;

import java.util.Arrays;

public class SumAbsDiffPair {
	public static void main(String args[]) {
		int a[] = { 1, 4, 7, 8 };
		int b[] = { 2, 3, 5, 6 };
		Arrays.sort(a);
		Arrays.sort(b);

		int finalAns = 0;
		for (int i = 0; i < a.length; i++) {
			finalAns += Math.abs(a[i] - b[i]);
		}
		System.out.println("final absolute value: " + finalAns);
	}
}
