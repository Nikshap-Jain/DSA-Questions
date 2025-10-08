package Dynamicprogramming.Questions;

import java.util.*;

public class LongestIncreasingSubsequence {// high probablity of russian doll
    public static void main(String[] args) {
        int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
    }

    public static int LIS(int[] arr) {// n^2
        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < dp.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    int x = dp[j];
                    dp[i] = Math.max(dp[i], x + 1);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    // nlogn
    public static int LIS2(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int len = 1;
        for (int i = 1; i < dp.length; i++) {
            if (arr[i] >= dp[len - 1]) {
                dp[len] = arr[i];
                len++;
            } else {
                int idx = binarySearch(dp, 0, len - 1, arr[i]);
                dp[idx] = arr[i];
            }
        }
        return len;
    }

    private static int binarySearch(int[] dp, int si, int ei, int item) {
        int ans = 0;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (dp[mid] >= item) {
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return ans;
    }
}
