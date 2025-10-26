package learning.practices.src.recurr;

public class FactorialFunction {
    public static int factFun(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factFun(n - 1);
        int fn = n * factFun(n - 1);
        return fn;

    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(factFun(n));
    }

}
