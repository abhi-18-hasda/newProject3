package learning.practices.src.arraysprogram;

public class MaxSumArrayKadanes {
    public static void kandaneAlgo(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int negativeVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                negativeVal = Math.max(negativeVal, arr[i]);
                currSum = 0;
            } else if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println("Max sum: " + Math.max(negativeVal, maxSum));
    }

    public static void main(String args[]) {
        int arr[] = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };
        //int arr[] = new int[] { -2, -3, -1, -2,-3 };
        kandaneAlgo(arr);

    }
}
