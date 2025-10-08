package Arrays.Assignment;

import java.util.*;

public class MaxSumPathTwoArr {
    public static void main(String[] args) {
        int arr1[] = { 2, 4, 5, 8, 10 };
        int arr2[] = { 4, 6, 8, 9 };
        int n1 = arr1.length;
        int n2 = arr2.length;

        // common
        int i = 0;
        int j = 0;
        int sum1 = 0;
        int sum2 = 0;
        int ans = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                ans += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j];
                j++;
            } else {
                sum1 += arr1[i];
                i++;
            }
        }

        if (i < n1) {
            for (int k = i; k < n1; k++) {
                sum1 += arr1[k];
            }
        }
        if (j < n2) {
            for (int k = j; k < n2; k++) {
                sum2 += arr2[k];
            }
        }

        ans += Math.max(sum1, sum2);

        System.out.println(ans);
    }
}
