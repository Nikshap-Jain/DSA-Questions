package Arrays.Assignment;

import java.util.Scanner;

public class RainwaterTrapping {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int t = sc.nextInt();
        // while (2 > 0){

        // }
        int arr[] = { 5, 4, 1, 2 };
        int n = arr.length;

        int lt = 0;
        int rt = rtFind(1, n - 1, arr);
        System.out.println(rt);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i < rt) {
                if (arr[lt] <= arr[i]) {
                    lt = i;
                } else {
                    ans += Math.min(arr[lt], arr[rt]) - arr[i];
                }

            } else {
                lt = rt;
                rt = rtFind(i + 1, n - 1, arr);
            }
        }
        System.out.println(ans);

    }

    public static int rtFind(int i, int l, int arr[]) {
        int res = i;
        if (i < l) {

            for (int j = i; j < l; j++) {
                if (arr[res] < arr[j + 1]) {
                    res = j + 1;
                }
            }

        }
        return res;
    }
}
