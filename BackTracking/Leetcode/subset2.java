package BackTracking.Leetcode;

import java.util.*;

public class subset2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(arr);
        print(arr, ll, 0);
    }

    public static void print(int arr[], List<Integer> ll, int idx) {

        for (int i = idx; i < arr.length; i++) {
            if (!(idx < i) || !(arr[i - 1] == arr[i])) {
                ll.add(arr[i]);
                System.out.println(ll);
                print(arr, ll, i + 1);
                ll.remove(ll.size() - 1);
            }

        }
    }
}
