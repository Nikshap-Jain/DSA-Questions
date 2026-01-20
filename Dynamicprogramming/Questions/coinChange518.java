package Dynamicprogramming.Questions;

import java.util.*;

public class coinChange518 {
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = { 1, 2, 5 };

        int[][] dp = new int[coins.length][amount + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(coin_Change(coins, amount, 0, dp));
    }

    public static int coin_Change(int[] coins, int amount, int i, int[][] dp) {
        if (amount == 0) {
            return 1;
        }

        if (i == coins.length) {
            return 0;
        }
        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }
        int inc = 0, exc = 0;
        if (amount >= coins[i]) {
            inc = coin_Change(coins, amount - coins[i], i + 1, dp);
        }

        exc = coin_Change(coins, amount, i + 1, dp);
        return dp[i][amount] = inc + exc;
    }

    // Bottom up of the above code - (same recursion from first)
    public int changeBottomUp(int amount, int[] coins) {
        int n = coins.length;
        // dp[i][j] : Ways to make amount 'j' using coins from index 'i' to end
        int[][] dp = new int[n + 1][amount + 1];

        // Base Case: If amount is 0, we found 1 way (do nothing)
        // This corresponds to "if (am == 0) return 1;"
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // FILLING ORDER:
        // 1. Coins: Iterate backwards from n-1 to 0 (because id needs id+1)
        // 2. Amount: Iterate forwards from 1 to amount (because am needs am - coin)

        for (int id = n - 1; id >= 0; id--) {
            for (int am = 1; am <= amount; am++) {

                // Option 1: Not Take (Skip this coin)
                // Corresponds to: ch(am, c, id + 1, dp)
                int notTake = dp[id + 1][am];

                // Option 2: Take (Use this coin)
                // Corresponds to: ch(am - c[id], c, id, dp)
                int take = 0;
                if (coins[id] <= am) {
                    take = dp[id][am - coins[id]];
                }

                dp[id][am] = take + notTake;
            }
        }

        // The answer is starting from index 0 with the full amount
        return dp[0][amount];
    }

    // monu bhaiya approach recursion from last apporach
    public static int coin_ChangeBU(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int am = 1; am < dp[0].length; am++) {
            int inc = 0, exc = 0;
            if (am >= coins[i - 1]) {
                inc = dp[i][am - coins[i - 1]];
            }
            exc = dp[i - 1][am];
            dp[i][am] = inc + exc;
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }
}
