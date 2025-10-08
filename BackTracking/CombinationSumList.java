package BackTracking;

import java.util.*;

public class CombinationSumList {
    public static void main(String[] args) {
        int[] coin = { 1, 2, 3, 5 };
        int amount = 5;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combination(coin, amount, ll, 0, ans);
        System.out.println(ans);
    }

    public static void combination(int coin[], int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {

        if (amount == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                ll.add(coin[i]);
                combination(coin, amount - coin[i], ll, i, ans);
                ll.remove(ll.size() - 1);
            }
        }
    }

}
