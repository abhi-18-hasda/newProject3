package learning.practices.src.recurr;

public class PrintDecOrder {
    public static void printDecreasing(int n){
        if(n == 1){
            System.out.println("1");
            return;
        }
        //System.out.println(n);
        printDecreasing(n-1);
        //for increasing order
        System.out.println(n);
    }
    public static void main(String args[]){
    int n = 10;
    printDecreasing(n);
    }

}
