package learning.practices.src.numbers;
import java.util.Scanner;

public class BinaryToDecimal {
    public static int convertBToD(int binaryNumber){

        int dec = 0;
        int pow = 0;
        while(binaryNumber>0){
            int mod = binaryNumber%10;
            dec = dec + (mod * (int)Math.pow(2, pow));
            pow++;
            binaryNumber = binaryNumber/10;

        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int binaryNumber = sc.nextInt();
        System.out.println(convertBToD(binaryNumber));
    }
}
