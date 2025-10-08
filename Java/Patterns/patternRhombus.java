package Java.Patterns;

import java.util.Scanner;

public class patternRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int star = 1;
        int row = 1;
        int space = N - 1;
        int flag = 1;
        while (row <= (N * 2) - 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int temp = flag;
            while (j <= star) {
                System.out.print(temp + " ");

                if (j <= star / 2) {
                    temp++;
                } else {
                    temp--;
                }
                j++;
            }

            if (row < N) {
                star += 2;
                space--;
                flag++;
            } else {
                star -= 2;
                space++;
                flag--;
            }

            System.out.println();
            row++;
        }
    }
}
