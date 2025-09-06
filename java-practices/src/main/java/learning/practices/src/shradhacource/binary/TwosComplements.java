package learning.practices.src.shradhacource.binary;

public class TwosComplements {
    public static void main(String args[]) {
        int num = 0b01010;
        int binNum = ~num + 1;
        System.out.println("2's complement: " + Integer.toBinaryString(binNum));
        System.out.println("output: " + binNum);
    }
}
