package RecursionAll.Recursion;

import Leatcode.first;

public class firstOccurance {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 5, 4, 7, 4 };
        int item = 4;
        int i = 0;
        first(item, arr, i);
    }

    public static void first(int item, int arr[], int i) {
        if (i == arr.length) {
            System.out.println(-1);
            return;
        }
        if (arr[i] == item) {
            System.out.println(i);
            return;
        }
        first(item, arr, i + 1);
    }
}
