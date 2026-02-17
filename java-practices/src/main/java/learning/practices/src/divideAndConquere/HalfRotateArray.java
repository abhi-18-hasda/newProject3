package learning.practices.src.divideAndConquere;

public class HalfRotateArray {
	public static void main(String args[]) {
		int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		int ans = findTarget(arr, target, 0, arr.length - 1);
		System.out.println(ans);
	}

	private static int findTarget(int[] arr, int target, int si, int ei) {
		if (si >= ei) {
			return -1;
		}
		int mid = si + (ei - si) / 2;
		if (arr[mid] == target) {
			return mid;
		}
		if (arr[si] <= arr[mid]) {
			if (arr[si] <= target && target <= arr[mid]) {
				// si = mid + 1;
				return findTarget(arr, target, si, mid);
			} else {
				// ei = mid - 1;
				return findTarget(arr, target, mid + 1, ei);
			}
		} else {
			if (arr[mid] <= target && target <= arr[ei]) {
				// ei = mid - 1;
				return findTarget(arr, target, mid + 1, ei);
			} else {
				// si = mid + 1;
				return findTarget(arr, target, si, mid - 1);
			}
		}
	}
}
