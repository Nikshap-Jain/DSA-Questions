package Arrays.Assignment;

import java.util.HashMap;

public class PairOfRoses {
    public static void main(String[] args) {
        int n = 2;
        int prices[] = { 40, 40 };
        int money = 80;

        int mixDif = Integer.MAX_VALUE;
        int rose1 = 0;
        int rose2 = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < prices.length; i++) {
            int rem = money - prices[i];
            if (hm.containsKey(rem)) {
                int diff = prices[i] - rem;
                diff = Math.abs(diff);
                if (diff < mixDif) {
                    rose1 = prices[i];
                    rose2 = rem;
                    mixDif = diff;
                }
            } else {
                hm.put(prices[i], i);
            }
        }

        System.out.println("roses whose prices are " + rose1 + " and " + rose2 + ".");
    }
}
