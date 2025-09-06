package learning.practices.src.pattern;

public class Pattern3 {
    public static void main(String args[]) {
        int r=5, c=r;
        for(int i=0;i<r;i++) {
            for(int j = 0; j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
