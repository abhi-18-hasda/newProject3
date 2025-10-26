package learning.practices.src.arraysprogram;

public class TrappedRainWater {
    public static int trapRainWater(int arr[]) {
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        int lmax = arr[0];
        int rmax = arr[arr.length-1];
        int sum = 0;
        if(arr.length == 1 || arr.length == 2){
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            lmax = Math.max(lmax, arr[i]);
            leftMax[i] = lmax;
        }

        for (int i = arr.length-1; i >= 0; i--) {
            rmax = Math.max(rmax, arr[i]);
            rightMax[i] = rmax;
        }

        for (int i = 0; i < arr.length; i++) {
            int trappedWater = ((Math.min(leftMax[i], rightMax[i])) - arr[i]) * 1;
            sum += trappedWater;
        }
        return sum;
    }

    public static void main(String args[]) {
        int arr[] = {4,2,0,3,2,5};
        int ans = trapRainWater(arr);
        System.out.println(ans);
    }

}
