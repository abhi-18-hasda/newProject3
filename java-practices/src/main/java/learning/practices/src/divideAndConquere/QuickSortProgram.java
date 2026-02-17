package learning.practices.src.divideAndConquere;

public class QuickSortProgram {
	public static void main(String args[]) {
		int[] arr = { 2, 1, 8, 3, 6, 7, 4 };
		quickSort(arr, 0, arr.length - 1);
		print(arr);
	}

	private static void quickSort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int pIdx = partition(arr, si, ei);
		quickSort(arr, si, pIdx - 1);
		quickSort(arr, pIdx + 1, ei);

	}

	private static int partition(int[] arr, int si, int ei) {
		int pivot = arr[ei];
		int i = si - 1;// for make the space for the elements

		for (int k = si; k < ei; k++) {
			if (arr[k] <= pivot) {
				i++;
				int temp = arr[k];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
		i++;
		int temp = pivot;
		arr[ei] = arr[i];
		arr[i] = temp;
		return i;
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
