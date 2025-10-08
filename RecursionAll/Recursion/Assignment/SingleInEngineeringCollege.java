package RecursionAll.Recursion.Assignment;

import java.util.*;

public class SingleInEngineeringCollege {
    public static void main(String[] args) {
        int n = 4;
        // int trees[] = new int[n];
        int trees[] = { 15, 19, 12, 13 };
        Arrays.sort(trees);
        int x = 6;

        findHeight(trees, x, n - 1, 0);
    }

    public static int findHeight(int n, int trees[], int high, int low) {

    }

    // public static void findHeight(int n, int[] trees, int x) {
    // int i = 1;
    // while (x > 0) {
    // if (i < n) {
    // if (trees[n - i] > trees[n - i - 1]) {
    // trees[n - i]--;
    // x = x - i;
    // } else {
    // i++;
    // }
    // } else {
    // x = x - i;
    // trees[n - i]--;
    // }
    // }
    // System.out.println(trees[n - i]);
    // }
}
