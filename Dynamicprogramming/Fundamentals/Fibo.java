package Dynamicprogramming.Fundamentals;

public class Fibo {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println(fibTD(n, dp));
    }

    public static int fibTD(int n, int[] dp) {// top down
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int f1 = fibTD(n - 1, dp);
        int f2 = fibTD(n - 2, dp);
        return dp[n] = f1 + f2;
    }

    public static int fibBU(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[0] = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[dp.length - 1];
    }
}
