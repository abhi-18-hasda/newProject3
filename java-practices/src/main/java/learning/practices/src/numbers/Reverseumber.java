package learning.practices.src.numbers;

public class Reverseumber {
    public static void main(String[] args) {
        int number = 17021998;
        int revNumber = 0;
        while(number>0){
            int lastDigit = number%10;
            //System.out.print(lastDigit+"");
            revNumber  = (revNumber*10)+ lastDigit;
            number = number/10;
        }
        System.out.println(revNumber);
    }
}
