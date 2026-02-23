package learning.practices.src.arraysprogram;

public class LargestElementPrint {
	public static void main(String args[]) {
		int arr[] = { 12, 43, 53, 53, 11, 10, 2 };
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int lIndex = 0;
		int sIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (largest <= arr[i]) {
				largest = arr[i];
				lIndex = i;
			}
			if (smallest >= arr[i]) {
				smallest = arr[i];
				sIndex = i;
			}
		}
		System.out.println("Max element: " + largest + " , ith index: " + lIndex);
		System.out.println("Min element: " + smallest + " , ith index: " + sIndex);
	}
}
