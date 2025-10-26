package learning.practices.src.numbers;

import java.util.Scanner;

public class ContinueStatementExample {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        do{

            System.out.print("Please enter your number: ");
            int number = sc.nextInt();
            if(number%10 ==0){
                continue;
            }
            System.out.println(number);
        }while(true);
    }
}
