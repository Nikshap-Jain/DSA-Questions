package BackTracking.Leetcode;

import java.util.*;

public class Combinations77 {
    public static void main(String[] args) {
        int n = 4, k = 2;
        List<Integer> ll = new ArrayList<>();
        print(n, k, ll, 1);
    }

    public static void print(int n, int k, List<Integer> ll, int idx) {
        if (k == 0) {
            System.out.println(ll);
            return;
        }

        for (int i = idx; i <= n; i++) {
            ll.add(i);
            print(n, k - 1, ll, i + 1);
            ll.remove(ll.size() - 1);
        }
    }
}
