package learning.practices.src.twoDarrayprogram;

public class SearchSortedMatrix {
    public static void SearcSortMatrix(int arr[][], int k) {
        int row = 0, col = arr[0].length - 1;
        boolean found = false;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == k) {
                System.out.println("Found [" + row + ", " + col + "]");
                found = true;
                break;
            }
            if (k <= arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 3, 50 } };
        int k = 311;
        SearcSortMatrix(arr, k);
    }
}
