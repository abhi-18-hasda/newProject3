package learning.practices.src.shradhacource.binary;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int binNum = scanner.nextInt();
        int ans = 0;
        int pow = 1;
        while (binNum > 0) {
            int rem = binNum % 2;
            ans += (rem * pow);
            binNum = binNum / 10;
            pow *= 2;
        }
        System.out.println(ans);
    }

}
