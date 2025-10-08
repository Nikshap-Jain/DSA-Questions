package Java.Patterns;

public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int space0 = 0;
        int space = n - 2;
        int row = 1;
        while (row <= n) {
            int j = 1;
            while (j <= space0) {
                System.out.print("  ");
                j++;
            }
            System.out.print("* ");
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            if (row != n / 2 + 1) {
                System.out.print("* ");
            }

            if (row <= n / 2) {
                space -= 2;
                space0++;
            } else {
                space += 2;
                space0--;
            }
            row++;
            System.out.println();
        }
    }
}
