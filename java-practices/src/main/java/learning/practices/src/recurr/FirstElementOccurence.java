package learning.practices.src.recurr;

public class FirstElementOccurence {
	public static void main(String args[]) {
		int[] arr = { 5,5,5,5,5 };
		int key = 5;
		findIndex(arr, key, 0);
		findLastIndex(arr, key, 0);
	}

	private static int findLastIndex(int[] arr, int key, int i) {
		if (i == arr.length) {
			return -1;
		}
		int isFound = findLastIndex(arr, key, i+1);
		if (isFound ==-1 && arr[i] == key) {
			System.out.println("last index no: " + i + " ");
			return i;
		}
		return isFound;
	}

	private static int findIndex(int[] arr, int key, int i) {
		if (i == arr.length) {
			return i;
		}
		if (arr[i] == key) {
			System.out.println("first index no: " + i + " ");
			return i;
		}
		return findIndex(arr, key, i + 1);

	}

	
}
