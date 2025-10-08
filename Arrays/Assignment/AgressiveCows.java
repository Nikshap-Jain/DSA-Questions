package Arrays.Assignment;

import java.util.*;

import Arrays.TwoDArrays.stairCaseSearch;

public class AgressiveCows {
    public static void main(String[] args) {
        int c = 3;
        int stalls[] = { 18, 2, 7 };
        int n = stalls.length;
        Arrays.sort(stalls);

        // int minDistance = 0;

        // for (int i = 1; i <= stalls[stalls.length - 1]; i++) {

        // if (!isPlace(stalls, i, c - 1)) {
        // minDistance = i - 1;
        // break;
        // } else {
        // minDistance = i;
        // }
        // }
        int low = 1;
        int high = stalls[stalls.length - 1];
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (!isPlace(stalls, mid, c - 1)) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
            System.out.println("mid" + mid + "low" + low + "high" + high);
        }

        // System.out.println(isPlace(stalls, 123, c - 1));
        // System.out.println(minDistance);
        System.out.println(ans);
    }

    public static boolean isPlace(int[] stalls, int minDistance, int c) {
        int temp = minDistance + stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (c == 0) {
                return true;
            } else {
                if (stalls[i] >= temp) {
                    c--;
                    temp = minDistance + stalls[i];
                }
            }
        }
        if (c != 0) {
            return false;
        } else {
            return true;
        }
    }
}
