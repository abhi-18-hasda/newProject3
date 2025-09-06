package learning.practices.src.sort;

public class QuickSorting {
    public static void main(String args[]) {
        int arr[] = {12, 1, 35, 8, 32, 32, 17, 1};
        int []ans = quickSort(arr, 0, arr.length-1);
        for(int data: ans) {
            System.out.print(data+", ");
        }
    }

    private static int[] quickSort(int[] arr, int st, int end) {
        if(st<end) {
            int pivot = partition(arr, st, end);
            quickSort(arr, st, pivot-1);
            quickSort(arr, pivot+1, end);
        }
        return arr;
    }

    private static int partition(int[] arr, int st, int end) {
        int indx = st-1, pivot = arr[end], j = st;
        for(j = st; j<end; j++) {
            if(arr[j]<= pivot) {
                indx++;
                swap(arr, indx, j);
            }
        }
        indx++;
        swap(arr, indx, j);
        return indx;
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;
    }

}
