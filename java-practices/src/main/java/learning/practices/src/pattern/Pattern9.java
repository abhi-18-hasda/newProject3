package learning.practices.src.pattern;

public class Pattern9 {
// 1
//    121
//   12321
//  1234321
// 123454321
    public static void main(String args[]) {
        int n=5;
        for(int i=1;i<=n;i++) {
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            for(int j = i-1; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
