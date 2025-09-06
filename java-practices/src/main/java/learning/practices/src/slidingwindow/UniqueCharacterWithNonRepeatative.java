package learning.practices.src.slidingwindow;

import java.util.HashMap;

public class UniqueCharacterWithNonRepeatative {
    public static void main(String args[]) {
        String s = "pwwkew";
        int length = s.length();
        int ans = helper(s, length);
        System.out.println(ans);
    }

    private static int helper(String s, int length) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0;
        while (j < length) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (map.size() == j - i + 1) {
                max = Math.max(max, j - i + 1);
            }

            while (map.size() < j - i + 1) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }
        return max;
    }

}
