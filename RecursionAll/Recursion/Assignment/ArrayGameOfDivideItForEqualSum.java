package RecursionAll.Recursion.Assignment;

import java.util.*;

public class ArrayGameOfDivideItForEqualSum {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 2 };
        System.out.println(game(arr, 0, arr.length - 1));
    }

    public static int game(int arr[], int start, int end) {

        if (start >= end) {
            return 0;
        }

        long sumi = 0, sumj = 0;
        for (int i = start; i <= end; i++) {
            sumi += arr[i];
            sumj = 0;
            for (int j = i + 1; j <= end; j++) {
                sumj += arr[j];
            }
            if (sumi == sumj) {
                int a = game(arr, start, i);
                int b = game(arr, i + 1, end);
                return Math.max(a, b) + 1;
            }
        }

        return 0;

    }

}
