package learning.practices.src.backtracking;

public class BacktrackingBasicPRogram {
	public static void main(String args[]) {
		int[] arr = new int[5];
		changeArr(arr, 0, 1);
		printArr(arr);
	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void changeArr(int[] arr, int i, int value) {
		// base condition
		if (i == arr.length) {
			printArr(arr);
			return;
		}
		// recursion
		arr[i] = value;
		changeArr(arr, i+1, value+1);
		arr[i] = arr[i] - 2;
	}
}
