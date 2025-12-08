package learning.practices.src.backtracking;

public class FindMaxSumDivByThree {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 1, 8 };
        int maxSum = findMaxSumDivByThree(arr, 0, 0);
        System.out.println(maxSum);
    }

    private static int findMaxSumDivByThree(int[] arr, int max, int i) {
        if (i == arr.length) {
            return (max%3 == 0)? max: Integer.MIN_VALUE;
        }
        int inclusive = findMaxSumDivByThree(arr, max + arr[i], i + 1);
        int exclusive = findMaxSumDivByThree(arr, max, i + 1);
        return Math.max(inclusive, exclusive);
    }
}
