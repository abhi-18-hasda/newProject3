package learning.practices.src.recurr;

import java.util.ArrayList;
import java.util.List;

public class RecurrCombineListOfArray {

    public static void main(String args[]) {
        List<List<Integer>> ans = combine(4, 2);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            // System.out.println();
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> ans = new ArrayList<Integer>();
        List<List<Integer>> combine = new ArrayList<List<Integer>>();

        helperMethodForCombineArray(n, k, 1, ans, combine);
        return combine;

    }

    private static void helperMethodForCombineArray(int n, int k, int start, List<Integer> currentList,
            List<List<Integer>> combine) {

        if (currentList.size() == k) {
            combine.add(new ArrayList<>(currentList));
            return;

        }

        for (int i = start; i <= n; i++) {
            currentList.add(i);
            helperMethodForCombineArray(n, k, i + 1, currentList, combine);
            currentList.remove(currentList.size() - 1);
        }
    }

}
