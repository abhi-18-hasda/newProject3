package learning.practices.src.numbers;

import java.util.Objects;
import java.util.Scanner;

public class DecimalToBinary {
    public static int convertDToB(int decimalNumber) {

        int pow = 0;
        int binary = 0;
        while (decimalNumber > 0) {
            int rem = decimalNumber % 2;
            binary = binary + rem * (int) Math.pow(10, pow);
            decimalNumber = decimalNumber / 2;
            pow++;

        }
        return binary;
    }

    public static boolean palindrom(int number) {

        int palin = 0;
        int myNumber = number;
        while (number > 0) {
            int rem = number % 10;
            palin = palin * 10 + rem;
            number = number / 10;

        }
        System.out.println(palin);
        if (myNumber == palin) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int decNumber = sc.nextInt();
        //System.out.println(convertDToB(decNumber));
        System.out.println(palindrom(decNumber));
    }
}
