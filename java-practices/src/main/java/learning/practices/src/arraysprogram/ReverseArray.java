package learning.practices.src.arraysprogram;

public class ReverseArray {
    public static void reverseArray(int arr[], int st, int end) {
        while (st < end) {
            int tempData = arr[st];
            arr[st] = arr[end];
            arr[end] = tempData;
            st++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 65, 22, 77, 43 };
        int st = 0;
        int end = arr.length-1;
        reverseArray(arr, st, end);
    }

}
