package Arrays.Assignment;

import java.util.*;

public class squaresOfSortedArray {
    public static void main(String[] args) {
        int arr[] = { -6, -3, -1, 2, 4 };
        int l = arr.length - 1;
        int f = 0;
        int n = arr.length;
        int sortedArray[] = new int[n];

        for (int i = 1; i <= arr.length; i++) {
            if (arr[f] * arr[f] > arr[l] * arr[l]) {
                sortedArray[n - i] = arr[f] * arr[f];
                f++;
            } else {
                sortedArray[n - i] = arr[l] * arr[l];
                l--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }

    }
}
