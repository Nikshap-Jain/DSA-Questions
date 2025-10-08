package Java.Patterns;

import java.util.Scanner;

public class pascalsTriangle {
    public static void main(String[] args) {

        // Varity one - Find the 3rd element in 8th row.

        // int n = 7;
        // int r = 2;
        // int num = 1;
        // int deno = 1;
        // int count = r;
        // for (int i = 0; i < count; i++) {
        // if (n > 1) {
        // num = num * n;
        // n--;
        // }
        // if (r > 1) {
        // deno = deno * r;
        // r--;
        // }
        // }

        // int ans = num / deno;
        // System.out.println(ans);

        // varity 2 : Printing entire pascals triangle

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 0;

        while (row < n) {
            int i = 0;
            int ncr = 1;
            while (i < star) {
                System.out.print(ncr + " ");
                ncr = ((row - i) * ncr) / (i + 1);
                i++;
            }
            System.out.println();
            row++;
            star++;
        }

    }
}
