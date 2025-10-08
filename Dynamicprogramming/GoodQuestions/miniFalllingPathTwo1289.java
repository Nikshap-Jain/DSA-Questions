package Dynamicprogramming.GoodQuestions;

public class miniFalllingPathTwo1289 {
    public static void main(String[] args) {
        int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
        Integer[][] dp = new Integer[matrix.length][matrix[0].length];
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(MinimumPath(matrix, 0, i, dp), ans);
        }
    }

    public static int MinimumPath(int[][] matrix, int cr, int cc, Integer[][] dp) {
        if (cr == matrix.length - 1) {
            return matrix[cr][cc];
        }

        if (dp[cr][cc] != null) {
            return dp[cr][cc];
        }

        int ans = Integer.MAX_VALUE;
        for (int col = 0; col < matrix[0].length; col++) {
            if (cc != col) {
                ans = Math.min(MinimumPath(matrix, cr + 1, cc, dp), ans);
            }
        }

        return dp[cr][cc] = ans + matrix[cr][cc];
    }
}
