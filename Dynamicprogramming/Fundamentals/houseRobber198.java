package Dynamicprogramming.Fundamentals;

import java.util.*;

public class houseRobber198 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 9, 1 };
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(Robber(arr, 0, dp));
    }

    public static int Robber(int[] arr, int i, int[] dp) {// topdown
        // Here array fill from end
        if (i >= arr.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + Robber(arr, i + 2, dp);
        int dont_rob = Robber(arr, i + 1, dp);
        return dp[i] = Math.max(rob, dont_rob);
    }

    // Bottom up approach - tabular for above code (recursion from front so we are
    // filling dp array from last)
    // public int rbTab (int nums[]){
    // int n = nums.length;
    // int dp[] = new int[n];
    // dp[n - 1] = nums[n - 1];
    // if (n >= 2){
    // dp[n - 2] = Math.max(dp[n -1], nums[n - 2]);
    // }

    // for (int i = n - 3; i >= 0; i--){
    // int a = nums[i] + dp[i + 2];
    // if (a > dp[i + 1]){
    // dp[i] = a;
    // }
    // else{
    // dp[i] = dp[ i + 1];
    // }
    // }
    // return dp[0];
    // }

    public static int Robber2(int[] arr, int i, int[] dp) {// topdown with backward recursion
        // Here array fill from start
        if (i < 0) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + Robber2(arr, i - 2, dp);
        int dont_rob = Robber2(arr, i - 1, dp);
        return dp[i] = Math.max(rob, dont_rob);
    }

    public static int RobberBU(int[] arr) { // in bottom up is same as backward recursion so we fill dp array from front
        // Here array fill from start
        if (arr.length == 1) {
            return arr[0];
        }
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < dp.length; i++) {
            int rob = arr[i] + dp[i - 2];
            int dont_rob = dp[i - 1];
            dp[i] = Math.max(rob, dont_rob);
        }
        return dp[dp.length - 1];
    }

}
