package learning.practices.src.arraysprogram;

public class SearchArrayInRotated {
    public static int searchInRotateArray(int arr[], int target) {
        int st = 0;
        int end = arr.length - 1;
        int n = arr.length;
        while (st <= end) {
            int mid = st+(end-st)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[st] <= arr[mid]) {
                if (arr[st] <= target && target <= arr[mid]) {
                    end = mid;

                } else {
                    st = mid+1;
                }
            } else {
                if (arr[mid + 1] <= target && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end=mid;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;
        int index = searchInRotateArray(arr, target);
        System.out.println(index);
    }

}
