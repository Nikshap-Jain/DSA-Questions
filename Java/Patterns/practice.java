package Java.Patterns;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 7;
        int row = 1;
        int star = 1;
        int space = n - 1;
        int space2 = -1;
        int flag = 1;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int k = 1;
            flag = star;
            while (k <= star) {
                System.out.print(flag + " ");
                k++;
                flag--;
            }

            int j = 1;
            while (j <= space2) {
                System.out.print("  ");
                j++;
            }
            if (row != 1 && row != n) {
                int l = 1;
                while (l <= star) {
                    System.out.print(l + " ");
                    l++;
                }
            }

            if (row <= n / 2) {
                space -= 2;
                space2 += 2;
                star++;
            } else {
                space += 2;
                space2 -= 2;
                star--;
            }
            row++;

            System.out.println();

        }
    }

}