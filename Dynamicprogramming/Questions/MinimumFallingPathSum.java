package Dynamicprogramming.Questions;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        int matrix[][] = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
        int ans = Integer.MAX_VALUE;
        Integer[][] dp = new Integer[matrix.length][matrix[0].length];// by default null because we use integer class
                                                                      // its best practice as we don't need to worry
                                                                      // about range
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(miniPath(matrix, 0, i, dp), ans);
        }
    }

    public static int miniPath(int [][]matrix, int cr, int cc, int[][]dp){
        if (cc < 0 || cc == matrix[0].length){
            return Integer.MAX_VALUE;
        }


        if (cr == matrix.length - 1){
            return matrix[cr][cc];
        }


        if (dp[cr][cc] != null){
            return dp[cr][cc];
        }

        int ld = miniPath(matrix, cr  + 1, cc - 1, dp);
        int rd = miniPath(matrix, cr + 1, cc + 1, dp);
        int down = miniPath(matrix, cr + 1, cc, dp);

        return dp[cr][cc] = 
    }
}
