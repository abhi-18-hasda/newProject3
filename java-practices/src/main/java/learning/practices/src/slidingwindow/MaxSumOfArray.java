package learning.practices.src.slidingwindow;

public class MaxSumOfArray {
    public static void main(String args[]) {
        int[] arr = { 2, 5, 1, 8, 2, 9, 1 };
        int k = 3;
        int n = arr.length;
        int sum = 0;
        int i = 0, j = 0, storeMax = 0;
        while (j < n) {
            sum += arr[j];
            if (j - i + 1 == k) {
                storeMax = Math.max(storeMax, sum);
                sum -= arr[i];
                i++;

            }
            j++;
        }
        System.out.println("Max value is: " + storeMax);
    }

}
