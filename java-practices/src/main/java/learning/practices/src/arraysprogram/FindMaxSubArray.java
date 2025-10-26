package learning.practices.src.arraysprogram;

public class FindMaxSubArray {
    public static void maxSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum+=arr[k];
                }
                if(maxSum<sum){
                    maxSum = sum;
                }
                if(minSum>sum){
                    minSum = sum;
                }
            }
        }
        System.out.println(maxSum);
        System.out.println(minSum);
    }
    public static void main(String args[]){
        int arr[]= {2,4,6,8,10,12};
        maxSubArray(arr);
    }
}
