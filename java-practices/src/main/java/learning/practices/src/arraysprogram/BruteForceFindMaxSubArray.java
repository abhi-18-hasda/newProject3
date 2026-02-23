package learning.practices.src.arraysprogram;

public class BruteForceFindMaxSubArray {
	public static void main(String args[]) {
		int arr[] = { 2, 4, 6, 8, 10 };
		findMaxSumArray(arr);
	}

	private static void findMaxSumArray(int[] arr) {
		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int st = i;
			for (int j = i + 1; j < arr.length; j++) {
				int end = j;
				int currSum = 0;
				for (int k = st; k <= end; k++) {
					currSum += arr[k];
				}
				if (sum <= currSum) {
					sum = currSum;
				}
			}
		}
		System.out.println("Max sum: " + sum);

	}
}
