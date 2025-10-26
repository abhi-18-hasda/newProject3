package learning.practices.src.arraysprogram;

import java.util.*;

public class FindMaximumLengthOfSubStringWithoutRepeating {
    public static int maxLength(String str) {
        int l = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        for (int r = 0; r < str.length(); r++) {
            char ch = str.charAt(r);
            while (set.contains(ch)) {
                set.remove(str.charAt(l));
                l++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, r - l + 1);

        }
        return maxLen;
    }

    public static void main(String args[]) {
        String str = "cadbzabcd";
        System.out.println((maxLength(str)));
    }

}
