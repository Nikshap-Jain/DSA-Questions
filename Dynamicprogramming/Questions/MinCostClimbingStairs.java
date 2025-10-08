package Dynamicprogramming.Questions;

import java.util.*;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = { 10, 15, 25 };
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        int zero = min(cost, 0, dp);
        int one = min(cost, 1, dp);
        System.out.println(Math.min(zero, one));
    }

    public static int min(int[] cost, int i, int[] dp) {
        if (i >= cost.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }
        int f = min(cost, i + 1, dp);
        int s = min(cost, i + 2, dp);
        return dp[i] = Math.min(f, s) + cost[i];
    }
}
