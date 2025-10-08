package Dynamicprogramming.Questions;

import java.util.*;

public class Minimum_Path_Sum {
    public static void main(String[] args) {
        int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(min(grid, 0, 0, dp));
    }

    public static int min(int[][] grid, int cr, int cc, int[][] dp) {
        if (cr == grid.length - 1 && cc == grid[0].length - 1) {
            return grid[cr][cc];
        }

        if (cr == grid.length || cc == grid[0].length) {
            return Integer.MAX_VALUE;
        }

        if (dp[cr][cc] != -1) {
            return dp[cr][cc];
        }
        int right = min(grid, cr, cc + 1, dp);
        int down = min(grid, cr + 1, cc, dp);
        return dp[cr][cc] = Math.min(right, down) + grid[cr][cc];
    }
}
