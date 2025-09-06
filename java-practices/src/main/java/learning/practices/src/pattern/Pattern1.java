package learning.practices.src.pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[]) {
        int n = 5;
        int i = 1;
//        while(i<=n) {
//            int j = 1;
//            while(j<=n) {
//                System.out.print(i);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//__________________________________
        while (i <= n) {
            int j = 1;
            while (j <= (n - i)) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= (2 * i - 1)) {
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
