package learning.practices.src.twoDarrayprogram;

public class TransformMatrix {
    public static void transform(int arr[][]) {
        System.out.println(arr.length);
        int rows = arr.length; // number of rows
        int cols = arr[0].length; // number of columns

        int temp[][] = new int[cols][rows];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int store = arr[i][j];
                temp[j][i] = store;
            }
        }
        System.out.println("Transform arr is: " + temp.length);
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 10, 20, 30 },
                { 11, 22, 33 },
                { 111, 222, 333 } };
        transform(arr);
    }
}
