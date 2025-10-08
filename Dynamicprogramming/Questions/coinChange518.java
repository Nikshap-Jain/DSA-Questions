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
