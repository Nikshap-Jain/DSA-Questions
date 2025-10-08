package Dynamicprogramming.Questions;

public class editDistance72 {
    public static void main(String[] args) {
        String s = "FOOD";
        String t = "Money";
    }

    public static int minOpp(String s, String t, int i, int j, int[][] dp) {
        if (i == s.length()) {
            return t.length() - j;
        }

        if (j == t.length()) {
            return s.length() - i;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 0;
        if (s.charAt(i) == t.charAt(j)) {
            ans = minOpp(s, t, i + 1, j + 1, dp);
        }

        else {
            int d = minOpp(s, t, i + 1, j, dp);
            int inc = minOpp(s, t, i, j + 1, dp);
            int r = minOpp(s, t, i + 1, j + 1, dp);
            ans = Math.min(inc, Math.min(d, r)) + 1;
        }
        return dp[i][j] = ans;
    }
}
