package learning.practices.src.slidingwindow;

public class LongestSubArrayOfK {
    public static void main(String args[]) {
        int[] arr = { 4, 1, 1, 1, 2, 3, 5 };
        int k = 5;
        int n = arr.length;
        int maxSubArray = getMaxSubArray(arr, k, n);
        System.out.println(maxSubArray);
    }

    private static int getMaxSubArray(int[] arr, int k, int n) {
        int i = 0, j = 0, max = 0, sum = 0;
        while (j < n) {
            sum += arr[j];
            if (sum == k) {
                max = Math.max(max, j - i + 1);
            }
            while (sum > k && i <= j) {
                sum = sum - arr[i];
                i++;
            }
            j++;
        }
        return max;
    }

}
