package RecursionAll.Recursion.Assignment;

import java.util.*;

public class SplitArrayRecursion {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 5 };
        int n = arr.length;
        int sum = 0;
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        boolean visit[] = new boolean[n];

        if (sum % 2 == 0) {
            print(arr, visit, sum / 2, al, 0);
        }

        System.out.println(count);

    }

    public static int count = 0;

    public static void print(int arr[], boolean visit[], int sum, List<Integer> al, int idx) {
        if (sum == 0) {
            count++;
            for (int i = 0; i < al.size(); i++) {
                System.out.print(al.get(i) + " ");
            }
            System.out.print("and ");
            for (int i = 0; i < visit.length; i++) {
                if (visit[i] != true) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
        if (sum < 0) {
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            al.add(arr[i]);
            visit[i] = true;
            print(arr, visit, sum - arr[i], al, i + 1);
            visit[i] = false;
            al.remove(al.size() - 1);
        }
    }
}
