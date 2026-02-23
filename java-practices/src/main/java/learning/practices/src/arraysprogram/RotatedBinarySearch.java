package learning.practices.src.arraysprogram;

public class RotatedBinarySearch {
	public static void main(String args[]) {
		int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
		int target = 7;

		int st = 0;
		int end = arr.length - 1;
		while (st <= end) {
			int mid = st + (end - st) / 2;
			if (arr[mid] == target) {
				System.out.println("find is: " + mid);
			}

			if (arr[st] <= arr[mid]) {
				if (target >= arr[st] && target < arr[mid]) {
					end = mid - 1;
				} else {
					st = mid + 1;
				}

			} else {
				if (target > arr[mid] && target <= arr[end]) {
					st = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		System.out.println("-1");
	}
}
