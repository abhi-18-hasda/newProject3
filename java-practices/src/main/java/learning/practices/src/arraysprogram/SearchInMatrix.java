package learning.practices.src.arraysprogram;

public class SearchInMatrix {
	public static void main(String args[]) {
		int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
		int key = 10;
		System.out.println(findOnMatrix(matrix, key));
	}

	private static boolean findOnMatrix(int[][] matrix, int key) {
		int row = matrix.length - 1;
		int col = 0;
		if (key >= matrix[row][col]) {
			while (row >= 0 && col < matrix[0].length) {
				if (matrix[row][col] == key) {
					System.out.println("Found the key");
					return true;
				}
				if (matrix[row][col] < key) {
					col++;
				} else {
					row--;
				}
			}
		}
		else {
			row = 0;
			col = matrix[0].length - 1;
			while (row < matrix.length && col >= 0) {
				if (matrix[row][col] == key) {
					System.out.println("Found the key");
					return true;
				}
				if (matrix[row][col] > key) {
					col--;
				} else {
					row++;
				}
			}
		}
		System.out.println("Not found");
		return false;
	}

}
