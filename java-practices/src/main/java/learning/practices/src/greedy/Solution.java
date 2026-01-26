package learning.practices.src.greedy;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chainLen = 1;
        int chainEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        return chainLen;
    }
    public static void main(String args[]) {
    	int pairs[][] = {{1,2}, {7,8}, {4,5}};
    	System.out.println("max chain len is: "+findLongestChain((pairs)));
    }
}
