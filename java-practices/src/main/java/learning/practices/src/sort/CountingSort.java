package learning.practices.src.sort;

public class CountingSort {
	public static void main(String args[]) {
		int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}

		int[] aux = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			aux[arr[i]]++;
		}
		int j = aux.length - 1;
		for (int i = aux.length - 1; i >= 0; i--) {
			while (aux[i] > 0) {
				arr[j] = i;
				j--;
				aux[i]--;
			}
		}

		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
