package Arrays.Assignment;

import java.util.*;

public class ArraysTargetSumTriplets {
    public static void main(String[] args) {
        int target = 10;
        int arr[] = { 5, 7, 9, 1, 2, 4, 6, 8, 3 };
        int n = 9;

        Arrays.sort(arr);

        // for (int i = 0; i < arr.length; i++) {
        // int first = arr[i];

        // for (int j = i + 1; j < n - 1; j++) {
        // int sum = first;
        // sum += arr[j];
        // if (sum < target) {
        // int last = target - sum;
        // // Binary Search
        // int min = j + 1;
        // int max = n - 1;
        // while (min <= max) {
        // int mid = (max - min) / 2 + min;
        // if (arr[mid] == last) {
        // System.out.println(first + ", " + arr[j] + " and " + last);
        // break;
        // } else if (arr[mid] <= last) {
        // min = mid + 1;
        // } else {
        // max = mid - 1;
        // }
        // }
        // } else {
        // break;
        // }
        // }
        // }

        // TWO POINTER APPROACH

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            } // why don't we need to put striver 3rd sol check that.
        }
    }
}
