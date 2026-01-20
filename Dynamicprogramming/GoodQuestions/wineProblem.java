package Dynamicprogramming.GoodQuestions;

/*Given n wines in a row, with integers denoting the cost of each wine respectively. Each year you can sell the first or the last wine in the row. Let the initial profits from the wines be P1, P2, P3..Pn. In the Yth year, the profit from the ith wine will be Y*P[i). The goal is to calculate the maximum profit that can be earned by selling all the wines. Suppose, wine array denotes the initial cost of each wine in the first year. winell =[2,3,5, 1, 4] */

public class wineProblem {
    public static void main(String[] args) {
        int[] wine = { 2, 3, 5, 1, 4 };
        int[][] dp = new int[wine.length][wine.length];
        System.out.println(maxProfit(wine, 0, wine.length - 1, 1, dp));
    }

    public static int maxProfit(int[] wine, int i, int j, int year, int[][] dp) {
        if (i > j) {
            return 0;
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int f = wine[i] * year + maxProfit(wine, i + 1, j, year + 1, dp);
        int l = wine[j] * year + maxProfit(wine, i, j - 1, year + 1, dp);
        return Math.max(f, l);
    }

    public static int maxProfitBu(int[] wine) {
        int[][] dp = new int[wine.length][wine.length];
        int year = wine.length;
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = wine[i] * year;
        }
        year--;
        for (int gap = 1; gap < wine.length; gap++) {
            for (int j = gap; j < wine.length; j++) {
                int i = j - gap;
                int f = wine[i] * year + dp[i + 1][j];
                int l = wine[j] * year + dp[i][j - 1];
                dp[i][j] = Math.max(f, l);
            }
            year--;
        }
        return dp[0][dp[0].length - 1];
    }
}
