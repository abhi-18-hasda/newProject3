package learning.practices.src.numbers;
import java.util.Scanner;

// formula --  n!/r!(n-r)!
public class BinomialCoefficient {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int r =  sc.nextInt();
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n-r);
        int bino_coe = fact_n/(fact_r*fact_n_r);
        System.out.println(bino_coe);
    }
}
