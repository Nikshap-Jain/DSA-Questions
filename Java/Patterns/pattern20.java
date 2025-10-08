package Java.Patterns;

public class pattern20 {
    public static void main(String[] args) {
        int n = 7;
        int space = n / 2;
        int space2 = -1;
        int star = 1;
        int row = 1;
        while (row <= 7) {

            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            System.out.print("* ");

            // space2
            int j = 1;

            while (j <= space2) {
                System.out.print("  ");
                j++;
            }

            // star
            if (row != 1 && row != n) {
                System.out.print("*");
            }

            if (row <= n / 2) {
                space--;
                space2 += 2;
            } else {
                space++;
                space2 -= 2;
            }

            row++;
            System.out.println();
        }
    }
}
