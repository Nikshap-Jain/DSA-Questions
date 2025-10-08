package BackTracking.Leetcode;

import java.util.*;

public class combination_sum_iii216 {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int k = 3;
        int n = 7;
        print(ll, ans, 1, k, n);
        System.out.println(ans);
    }

    public static void print(List<Integer> ll, List<List<Integer>> ans, int idx, int k, int n) {
        if (n == 0 && k == 0) {
            ans.add(new ArrayList(ll));
            return;
        }
        if (n < 0 || k < 0) {
            return;
        }
        for (int i = idx; i < 10; i++) {
            ll.add(i);
            print(ll, ans, i + 1, k - 1, n - i);
            ll.remove(ll.size() - 1);
        }
    }
}
