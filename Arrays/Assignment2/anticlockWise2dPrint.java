package Arrays.Assignment2;

import java.util.Scanner;

public class anticlockWise2dPrint {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int m = sc.nextInt();
        // int n = sc.nextInt();
        // int arr[][] = new int[m][n];
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        int m = 4;
        int n = 4;

        int arr[][] = { { 11, 12, 13, 14 },
                { 21, 22, 23, 24 },
                { 31, 32, 33, 34 },
                { 41, 42, 43, 44 } };

        int tr = 0, lr = m - 1, tc = 0, lc = n - 1;

        while (tr <= lr || tc <= lc) {
            for (int i = tr; i <= lr && tr <= lr; i++) {
                System.out.print(arr[i][tc] + ", ");
            }
            tc++;

            for (int i = tc; i <= lc && tc <= lc; i++) {
                System.out.print(arr[lr][i] + ", ");
            }
            lr--;

            for (int i = lr; i >= tr && tr <= lr; i--) {
                System.out.print(arr[i][lc] + ", ");
            }
            lc--;

            for (int i = lc; i >= tc && tc <= lc; i--) {
                System.out.print(arr[tr][i] + ", ");
            }
            tr++;
        }
        System.out.println("END");
    }
}
