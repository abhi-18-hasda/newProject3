package learning.practices.src.numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num == 2){
            System.out.println("Given number is prime");
        }else{
            for(int i =2;i<=Math.sqrt(num);i++){
                if(num%i == 0){
                   isPrime = false;
                }
            }
        }
        if(!isPrime){
            System.out.println("Not a prime number");
        }else{
            System.out.println("Given number is prime");
        }
    }

}
