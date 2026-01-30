package Sorting;

import java.util.*;

public class counting {
    // When range is too small we use counting sort. its of tc and space complexity
    // O(N).
    // We just need to create frequency array and print according to it this is
    // counting sort.

    public static void main(String[] args) {
        int arr[] = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 0 };
        System.out.println(Arrays.toString(countSort(arr)));
    }

    public int[] countSort(int arr[]) {
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }
        int freq[] = new int[max + 1];

        for (int i = 0; i <= n; i++) {
            freq[arr[i]]++;
        }

        // now we just need to create array according to frequency array we can do it
        // simply or if we need to preserve the order like 1 on 2nd index in arr comes
        // after 1 on 1st index than we can do this

        for (int i = 1; i <= max; i++) {
            freq[i] = freq[i] + freq[i - 1];
        }

        int ans[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[freq[arr[i]]] = arr[i];
            freq[arr[i]]--;
        }

        return ans;
    }
}
