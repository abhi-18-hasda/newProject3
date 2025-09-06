package learning.practices.src.shradhacource.arrays;

public class KadensAlgo {
    public static void main(String args[]) {
        int arr[] = { 3, -4, 5, 4, -1, 7, -8 };
        int currSum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            max = Math.max(max, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("Max subarray is: " + max);
    }

}
