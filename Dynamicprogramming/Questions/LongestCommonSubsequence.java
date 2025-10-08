package Dynamicprogramming.Questions;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int dp[][] = new int[text1.length()][text2.length()];
    }

    public static int lcs(String text1, String text2, int i, int j, int dp[][]) {

        if (i == text1.length() || j == text2.length()) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 0;
        if (text1.charAt(i) == text2.charAt(i)) {
            ans = 1 + lcs(text1, text2, i + 1, j + 1);
        } else {
            int f = lcs(text1, text2, i + 1, j);
            int s = lcs(text1, text2, i, j + 1);
            ans = Math.max(s, f);
        }
        return ans;
    }

    public static int LCSBU(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
    }

}
