package Arrays.Assignment2;

import java.util.Scanner;

public class painterPartition {
    public static void main(String[] args) {
        int k = 2;
        int n = 2;
        long lengths[] = { 1, 10 };

        long ans = 0;
        if (k >= n) {
            for (int i = 0; i < lengths.length; i++) {
                ans = Math.max(lengths[i], ans);
            }
        } else {

        }

        System.out.println(ans);
    }
}
