package learning.practices.src.slidingwindow;

import java.util.HashMap;

public class UniqueCharacterSubsString {
    public static void main(String args[]) {
        String s = "aabacbebebe";
        int k = 3;
        int ans = helper(s, k, s.length());
        System.out.println(ans);
    }

    private static int helper(String s, int k, int length) {
        int max = 0;
        int i = 0, j = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while (j < length) {
            hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0) + 1);
            if (hm.size() == k) {
                max = Math.max(max, j - i + 1);
            }
            while (hm.size() > k) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
                if (hm.get(s.charAt(i)) == 0) {
                    hm.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }
        return max;
    }

}
