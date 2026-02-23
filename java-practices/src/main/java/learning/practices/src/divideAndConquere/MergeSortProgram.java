package learning.practices.src.divideAndConquere;

public class MergeSortProgram {
	public static void main(String args[]) {
		int[] arr = { 7, 3, 2, 1, 9, 6 };
		mergeSort(arr, 0, arr.length - 1);
		print(arr);
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void mergeSort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		mergeSort(arr, si, mid);
		mergeSort(arr, mid + 1, si);
		merge(arr, si, ei, mid);
	}

	private static void merge(int[] arr, int si, int ei, int mid) {
		int[] temp = new int[ei - si + 1];

		int i = si;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= ei) {
			if (arr[i] < arr[j]) {
				temp[k] = arr[i++];
			} else {
				temp[k] = arr[j++];
			}
			k++;
		}
		while (i <= mid) {
			temp[k++] = arr[i++];

		}
		while (j <= ei) {
			temp[k++] = arr[j++];

		}
		for (k = 0, si = 0; k < temp.length; k++, si++) {
			arr[si] = temp[k];
		}

	}
}
