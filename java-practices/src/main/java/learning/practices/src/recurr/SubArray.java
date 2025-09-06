package learning.practices.src.recurr;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> answer = getAllSubString(arr);

        for (List<Integer> subset : answer) {
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> getAllSubString(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> subSet = new ArrayList<>();
        int i = 0;
        printSubset(arr, ans, i, subSet);
        return subSet;
    }

    public static void printSubset(int[] arr, List<Integer> ans, int i, List<List<Integer>> subSet) {
        if (i == arr.length) {
            List<Integer> set = new ArrayList<>();
            for (int val : ans) {
                set.add(val);
            }
            subSet.add(set);
            return;
        }
        ans.add(arr[i]);
        printSubset(arr, ans, i + 1, subSet);
        // here the back tracking is started...
        ans.remove(ans.size() - 1);
        printSubset(arr, ans, i + 1, subSet);
    }
}
