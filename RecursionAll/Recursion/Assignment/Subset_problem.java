package RecursionAll.Recursion.Assignment;

import java.util.*;

public class Subset_problem {
    public static void main(String[] args) {
        int target = 3;
        // int arr[] = new int[3];
        int arr[] = { 1, 2, 3 };
        List<Integer> al = new ArrayList<>();
        print(arr, target, 0, al);
        System.out.println();
        System.out.println(count);
    }

    public static int count = 0;

    public static void print(int arr[], int target, int idx, List<Integer> ll) {

        if (target == 0) {
            count++;

            for (int i = 0; i < ll.size(); i++) {
                System.out.print(ll.get(i) + " ");
            }
            System.out.print(" ");
            return;
        }

        if (idx == arr.length) {
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            ll.add(arr[i]);
            print(arr, target - arr[i], i + 1, ll);
            ll.remove(ll.size() - 1);
        }
    }
}
