package learning.practices.src.slidingwindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaxValueOfArray {
    public static void main(String args[]) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int n = arr.length;
        int k = 3;
        ArrayList<Integer> ans = getHelperToGetMaxValue(arr, n, k);
        System.out.println(ans);
    }

    private static ArrayList<Integer> getHelperToGetMaxValue(int[] arr, int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> arrDequeue = new ArrayDeque<>();
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        for (j = 0; j < n; j++) {
            while (!arrDequeue.isEmpty() && arr[arrDequeue.peekLast()] < arr[j]) {
                arrDequeue.pollLast();
            }
            // add currect index in dequeue
            arrDequeue.addLast(j);
            // remove the first element from the window
            if (arrDequeue.peekFirst() < j - k + 1) {
                arrDequeue.pollFirst();
            }
            // capture the max value
            if (j >= k - 1) {
                ans.add(arr[arrDequeue.peekFirst()]);
            }
        }
        return ans;
    }

}
