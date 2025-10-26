package learning.practices.src.arraysprogram;

public class MaximumSelectionPointOfCard {

    public static int maxPickedPointOfCard(int arr[], int k) {
        // 6,2,3,4,7,2,1,7,1
        int lsum = 0;
        int rsum = 0;
        int rindex = arr.length - 1;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }
        for (int i = k - 1; i >= 0; i--) {
            lsum -= arr[i];
            rsum = rsum + arr[rindex];
            rindex--;
            maxSum = Math.max(maxSum, (lsum + rsum));
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = {6,2,3,4,7,2,1,7,1 };
        int k = 4;
        System.out.println(maxPickedPointOfCard(arr, k));
    }
}
