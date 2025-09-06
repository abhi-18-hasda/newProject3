package learning.practices.src.recurr;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));
        System.out.println("Original Array: " + arr);
        sort(arr);
        System.out.println("Sorted Array: " + arr);
    }

    private static void sort(ArrayList<Integer> arr) {
        // TODO Auto-generated method stub
        if(arr.size() == 1) {
            return;
        }
        int temp = arr.remove(arr.size()-1);
        sort(arr);
        insert(arr, temp);
    }

    private static void insert(ArrayList<Integer> arr, int temp) {
        if(arr.size() == 0 || arr.get(arr.size()-1)<= temp) {
            arr.add(temp);
            return;
        }
        int val = arr.remove(arr.size()-1);
        insert(arr, temp);
        arr.add(val);
    }
}
