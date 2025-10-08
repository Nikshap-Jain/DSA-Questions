package Java.SlidingWindow;

import java.util.*;

public class SlidingWindowMax239 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int ans[] = windowMax(arr, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] windowMax(int[] arr, int k) {
        Deque<Integer> q = new LinkedList<>();
        int[] ans = new int[arr.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && arr[q.getLast()] < arr[i]) {
                q.removeLast();
            }
            q.add(i);
        }

        int j = 0;
        ans[j++] = arr[q.getFirst()];

        for (int i = k; i < arr.length; i++) {
            // grow
            while (!q.isEmpty() && arr[q.getLast()] < arr[i]) {
                q.removeLast();
            }
            q.add(i);

            // Shrink
            if (q.getFirst() == i - k) {
                q.removeFirst();
            }

            // ans calculate
            ans[j++] = arr[q.getFirst()];
        }
        return ans;
    }
}
