package learning.practices.src.slidingwindow;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountAnagramOccurrences {
    public static void main(String args[]) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        int totalValue = totalCountAnagram(txt, pat);
        System.out.println(totalValue);
    }

    private static int totalCountAnagram(String txt, String pat) {
        int k = pat.length();
        int n = txt.length();
        int count = 0;
        int i = 0, j = 0;
        Map<Character, Integer> hmap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();
        for (char c : pat.toCharArray()) {
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        while (j < n) {
            windowMap.put(txt.charAt(j), windowMap.getOrDefault(txt.charAt(j), 0) + 1);
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (windowMap.equals(hmap)) {
                    count++;
                }
                char leftTxt = txt.charAt(i);
                //System.out.println(leftTxt);
                if (windowMap.get(leftTxt) == 1) {
                    windowMap.remove(leftTxt);
                } else {
                    windowMap.put(leftTxt, windowMap.get(leftTxt) - 1);
                }
                i++;
                j++;
            }
        }
        return count;
    }

}
