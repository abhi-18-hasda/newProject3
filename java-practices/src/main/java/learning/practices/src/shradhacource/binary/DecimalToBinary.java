package learning.practices.src.shradhacource.binary;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an number: ");
        int decNum = scanner.nextInt();
        int ans = 0;
        int pow = 1;
        while (decNum > 0) {
            int rem = decNum % 2;
            decNum = decNum / 2;
            ans += (rem * pow);
            pow *= 10;
        }
        System.out.println(ans);
    }

}
