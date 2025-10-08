package BackTracking.Leetcode;

import java.util.*;

public class CombinationIIprb40 {
    public static void main(String[] args) {
        int arr[] = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        Arrays.sort(arr);
        print(arr, target, "", 0);
    }

    public static void print(int arr[], int target, String ans, int idx) {
        if (target == 0) {
            System.out.println(ans);
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (!(i > idx && arr[i] == arr[i - 1])) {
                print(arr, target - arr[i], ans + arr[i], i + 1);
            }

        }
    }

}
