package learning.practices.src.shradhacource.arrays;

public class ReverseAnArray {
    public static void main(String args[]) {
        int arr[] = { 2, 34, 11, -454, 22, 56 };
        int i=0, j=arr.length-1;
        while(i<j) {
            int firstVal = arr[i];
            int lastVal = arr[j];
            arr[i]=lastVal;
            arr[j]=firstVal;
            i++;
            j--;
        }
        for(int num: arr) {
            System.out.print(num+", ");
        }
    }
}
