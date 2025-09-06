package learning.practices.src.stringprogram;

public class Palindrom {
    public static void main(String args[]) {
        String data = "ABCDCBA";
        int start = 0;
        int end = data.length() - 1;
        boolean isPalindrom = true;
        while (start < end) {
            if (data.charAt(start) != data.charAt(end)) {
                System.out.println("Not Palindrom");
                isPalindrom = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrom)
            System.out.println("Palindrom");
    }
}
