package learning.practices.src.stringprogram;

import java.util.Scanner;

public class reverseString {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the value for reverse");
        String name = scanner.nextLine();
        String revData = "";
        int lenghtOfName = name.length()-1;
        while(lenghtOfName>=0) {
            revData = revData+name.charAt(lenghtOfName);
            lenghtOfName--;
        }
        System.out.println(revData);
    }
}
