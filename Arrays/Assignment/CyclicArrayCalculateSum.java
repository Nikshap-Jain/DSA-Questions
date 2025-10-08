package Arrays.Assignment;

import java.util.*;

public class CyclicArrayCalculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int xValues[] = new int[x];
        for (int i = 0; i < x; i++) {
            xValues[i] = sc.nextInt();
        }
        for (int i = 0; i < x; i++) {
            int copyArr[] = Arrays.copyOf(arr, n);
            for (int j = 0; j < n; j++) {
                int behindIndx = 0;
                if (j - i < 0) {
                    behindIndx = n + (j - i);
                } else {
                    behindIndx = j - i;
                }
                arr[j] = copyArr[j] + copyArr[behindIndx];
            }
        }

        int sum = Arrays.stream(arr).sum();

        System.out.println(sum);
    }
}
