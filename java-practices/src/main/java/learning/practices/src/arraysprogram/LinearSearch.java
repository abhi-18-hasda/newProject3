package learning.practices.src.arraysprogram;

public class LinearSearch {
	public static void main(String args[]) {
		int arr[] = { 12, 43, 53, 55, 11, 10, 2 };
		int key = 113;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Not Found: " + key);
		} else {
			System.out.println("Found: " + key);
		}
	}

}
