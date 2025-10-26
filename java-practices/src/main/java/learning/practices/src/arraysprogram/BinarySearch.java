package learning.practices.src.arraysprogram;

public class BinarySearch {
    public static void searchBinary(int arr[], int st, int end, int key){
        while(st<=end){
            int mid = (st+end)/2;
            if(arr[mid] == key){
                System.out.println("Key is found: "+ arr[mid]);
                return;
            }
            if(arr[mid]<key){
                st = mid+1;
            }
            if(arr[mid]>key){
                end = mid-1;
            }
        }
        System.out.println("Not found: "+key);
    }
    public static void main(String args[]){
        int arr[]= {2,4,6,8,10,14,22,56};
        int st = 0;
        int end = arr.length - 1;
        searchBinary(arr, st, end, 10);
    }

}
