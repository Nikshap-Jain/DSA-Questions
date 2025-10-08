package RecursionAll.Recursion.Assignment;

import java.util.*;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(find(arr, target, 0));
    }

    public static int find(int arr[], int target, int i) {
        if (arr[i] == target) {
            return i;
        }
        if (i > arr.length) {
            return -1;
        }
        return find(arr, target, i + 1);
    }
}
