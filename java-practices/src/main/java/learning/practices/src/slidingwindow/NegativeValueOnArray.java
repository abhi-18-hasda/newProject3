package learning.practices.src.slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NegativeValueOnArray {
    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(-1);
        arr.add(-7);
        arr.add(8);
        arr.add(-15);
        arr.add(30);
        arr.add(13);
        arr.add(28);
        ArrayList<Integer> ans = getNegativeValueOnly(arr, 3);
        System.out.println(ans);
    }

    private static ArrayList<Integer> getNegativeValueOnly(List<Integer> arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int i = 0, j = 0;
        while (j < arr.size()) {
            if (arr.get(j) < 0) {
                queue.add(arr.get(j));
            }
            if (j - i + 1 == k) {
                if (!queue.isEmpty()) {
                    ans.add(queue.peek());
                } else {
                    ans.add(0);
                }
                if (!queue.isEmpty() && queue.peek().equals(arr.get(i))) {
                    queue.poll();
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
