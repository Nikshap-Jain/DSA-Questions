package BackTracking.Leetcode;

import java.util.*;

public class permutationII47 {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int arr[] = { 1, 1, 2 };
        boolean visited[] = new boolean[arr.length];
        Arrays.sort(arr);
        print(ll, ans, arr, visited);
        System.out.println(ans);
    }

    public static void print(List<Integer> ll, List<List<Integer>> ans, int arr[], boolean visited[]) {
        if (ll.size() == arr.length) {
            ans.add(new ArrayList(ll));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == false) {
                if (i == 0 || !(arr[i - 1] == arr[i]) || visited[i - 1] == false) {
                    ll.add(arr[i]);
                    visited[i] = true;
                    print(ll, ans, arr, visited);
                    ll.remove(ll.size() - 1);
                    visited[i] = false;
                }

            }
        }
    }
}
