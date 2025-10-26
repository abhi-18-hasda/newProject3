package learning.practices.src.twoDarrayprogram;

public class DiagonalSum {
    public static void diagonalMatSum(int arr[][]) {
        int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (i == j) {
        //             sum += arr[i][j];
        //         } else {
        //             if (i + j == arr.length - 1) {
        //                 sum += arr[i][j];
        //             }
        //         }
        //     }
        // } O(n^2)
        // below code taking O(n) sc- O(1)
        for(int i = 0;i< arr.length;i++){
            //PD
            sum+=arr[i][i];
            //SD
            if(i != arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        diagonalMatSum(arr);
    }
}
