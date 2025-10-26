package learning.practices.src.arraysprogram;

import java.util.*;

public class SumOfTriplet {
    public static List<List<Integer>> sumOfThree(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i =0;i<n-2;i++){
            int low = i+1;
            int high = n-1;
            while(low<high){
                int sum = arr[i]+ arr[low]+arr[high];
                if(sum == 0){
                    List<Integer> li = new ArrayList<>();
                    li.add(arr[i]);
                    li.add(arr[low]);
                    li.add(arr[high]);
                    hs.add(li);
                    low++;
                    high--;
                }else if(sum<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return new ArrayList<>(hs);
    }
    public static void main(String args[]){
        int arr[]= {-1,0,1,2,-1,-4};
        //Output: [[-1,-1,2],[-1,0,1]]
        List<List<Integer>> li= sumOfThree(arr);
        System.out.println(li);

    }
}
