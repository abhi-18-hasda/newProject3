package learning.practices.src.divideAndConquere;

public class StringArraySort {
	public static void main(String args[]) {
		String[] arr = { "sun", "earth", "mars", "mercury" };
		String[] ans = sortString(arr, 0, arr.length - 1);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

	private static String[] sortString(String[] str, int si, int ei) {
		if (si == ei) {
			String[] a = { str[si] };
			return a;
		}
		int mid = si + (ei - si) / 2;
		String[] arr1 = sortString(str, si, mid);
		String[] arr2 = sortString(str, mid + 1, ei);
		String[] arr3 = merge(arr1, arr2);
		return arr3;

	}

	private static String[] merge(String[] arr1, String[] arr2) {
		int i = 0;
		int j = 0;
		int m = arr1.length;
		int n = arr2.length;
		int idx = 0;

		String[] ans = new String[m + n];
		while (i < m && j < n) {
			if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
				ans[idx] = arr1[i];
				i++;
				idx++;
			} else {
				ans[idx] = arr2[j];
				j++;
				idx++;
			}
		}
		while (i < m) {
			ans[idx] = arr1[i];
			i++;
			idx++;
		}
		while (j < n) {
			ans[idx] = arr2[j];
			j++;
			idx++;
		}

		return ans;
	}

	private static boolean isAlphabeticallySmaller(String str1, String str2) {
		if (str1.compareTo(str2) < 0) {
			return true;
		}
		return false;
	}
}
