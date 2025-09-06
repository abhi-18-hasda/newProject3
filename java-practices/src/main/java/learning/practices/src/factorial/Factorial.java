package learning.practices.src.factorial;

public class Factorial {

    public static void main(String args[]) {
        int n = 5;
        int i = 1;
        while(n>0) {
            i*=n;
            n--;
        }
        System.out.println(i);
    }
}
