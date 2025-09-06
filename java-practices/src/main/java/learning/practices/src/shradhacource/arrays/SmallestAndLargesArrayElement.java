package learning.practices.src.shradhacource.arrays;

public class SmallestAndLargesArrayElement {
    public static void main(String args[]) {
        int arr[] = { 2, 34, 11, -454, 22, 56 };
        int size = arr.length;
        int max = 0, k = 0, j = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
                k = i;
            } else if (max < arr[i]) {
                max = arr[i];
                j = i;
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
        System.out.println("Index of max value: " + j + " Index of min: " + k);
    }

}
