package Arrays.Assignment;

import java.util.*;

public class nextPermutation {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2 };
        int n = arr.length;

        // MY SOLUTION
        boolean flag = false;
        // next lexicographyical sequence;
        int startInd = 0;
        for (int i = n - 1; i >= 0; i--) {
            int nextMax = Integer.MAX_VALUE;

            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] > arr[i]) {
                    if (nextMax > arr[j]) {
                        startInd = j;
                        nextMax = arr[j];
                    }

                    flag = true;
                }

            }
            if (flag) {
                int temp = arr[startInd];
                arr[startInd] = arr[i];
                arr[i] = temp;
                startInd = i + 1;

                break;
            }
        }

        Arrays.sort(arr, startInd, arr.length);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Striver Solution which is optimal - O(N)

        /*
         * step 1 - Find the longest prefix basically the break point where we get a
         * smaller value from the last. arr[i-1] < arr[i] (because till break point it
         * will be in desc that' why we are unable to find next permutation till break
         * point)
         * 
         * 
         * step 2 - Find the next big element than the break point and swap it
         * 
         * step 3 - After swapping you just need to reverse the array after break point
         * because it will sure be in decending order and you need ascending order.
         */
    }
}
