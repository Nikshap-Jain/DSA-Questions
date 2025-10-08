package BackTracking.Leetcode;

import java.util.*;

import Arrays.TwoDArrays.input;

public class permutations46 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        boolean visited[] = new boolean[arr.length];
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        print(arr, visited, 0, ll, ans);
    }

    public static void print(int arr[], boolean visited[], int count, List<Integer> ll, List<List<Integer>> ans) {
        if (count == visited.length) {
            System.out.println(ll);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                ll.add(arr[i]);
                print(arr, visited, count + 1, ll, ans);
                visited[i] = false;
                ll.remove(ll.size() - 1);
            }

        }
    }
}
