package learning.practices.src.arraysprogram;

public class BuyAndSell {
    public static int buySellProduct(int arr[]){
        int maxProfit = Integer.MIN_VALUE;
        int minProfit = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            minProfit = Math.min(arr[i], minProfit);
            maxProfit = Math.max((arr[i]-minProfit), maxProfit);
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int arr[] = {7,6,4,3,1};
        System.out.println(buySellProduct(arr));
    }

}
