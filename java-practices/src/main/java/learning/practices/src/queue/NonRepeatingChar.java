package learning.practices.src.queue;

import java.util.LinkedList;
import java.util.Queue;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabccxb";
        findFirstChar(str);
        // System.out.println(index);
    }

    private static void findFirstChar(String str) {
        if (str.length() == 0) {
            System.out.println("it is null");
        }
        int[] freq = new int[26];
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            freq[ch - 'a']++;
            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.remove();
            }
            if (!queue.isEmpty()) {
                System.out.println(queue.peek());
            } else {
                System.out.println("-1");
            }
        }
        System.out.println();
    }
}
