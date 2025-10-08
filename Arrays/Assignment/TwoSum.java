package Arrays.Assignment;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();
        int arr[] = { 1, 3, 4, 2, 5 };
        int target = 5;

        // TWO POINTER APPROACH
        Arrays.sort(arr);

        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int sum = arr[min] + arr[max];
            if (sum == target) {
                System.out.println(arr[min] + " and " + arr[max]);
                int currentmin = arr[min];
                while (min < max && arr[min] == currentmin) {
                    min++;
                }
                int currentMax = arr[max];
                while (min < max && arr[max] == currentMax) {
                    max--;
                }

            } else if (sum < target) {
                min++;
            } else {
                max--;
            }
        }

    }
}
