package learning.practices.src.twoDarrayprogram;

public class SpiralMatrix {

    public static void spiralForm(int arr[][]) {
        int n = arr.length;
        int startRow = 0, endRow = arr.length - 1, startCol = 0, endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }

            // top
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                // if(startRow == endRow){
                //     break;
                // }
                System.out.print(arr[endRow][i] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                // if(startCol == endCol){
                //     break;
                // }
                System.out.print(arr[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // int arr[][] = { { 1, 2, 3, 4 },
        //         { 5, 6, 7, 8 },
        //         { 9, 10, 11, 12 },
        //         { 13, 14, 15, 16 } };
        // int arr[][] = { { 1, 2, 3 },
        //                 { 4, 5, 6 },
        //                 { 7, 8, 9 } };
        int arr[][] = { { 1, 2, 3, 4, 5, 6 },
                        { 7, 8, 9, 10, 11, 12}};
        spiralForm(arr);
    }
}
