package Java.Patterns;

public class pattern19 {
    public static void main(String[] args) {
        // int n = 7;
        // int star = n / 2 + 1;
        // int space = 0;
        // int row = 1;
        // while (row <= n) {
        // // star
        // int i = 1;
        // while (i <= star) {
        // System.out.print("* ");
        // i++;
        // }

        // // space
        // int j = 1;
        // while (j <= space) {
        // System.out.print(" ");
        // j++;
        // }
        // // star
        // int k = 1;
        // while (k <= star) {
        // System.out.print("* ");
        // k++;
        // }

        // // mirror
        // if (row <= n / 2) {
        // space += 2;
        // star--;
        // } else {
        // space -= 2;
        // star++;
        // }

        // // next line

        // row++;
        // System.out.println();
        // }

        int n = 7;
        int star = n / 2 + 1;
        int space = -1;
        int row = 1;
        while (row <= n) {
            // star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            // space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            // star
            int k = 1;
            if (row == 1 || row == n) {
                k = 2;
            }

            while (k <= star) {
                System.out.print("* ");
                k++;
            }

            // mirror
            if (row <= n / 2) {
                space += 2;
                star--;
            } else {
                space -= 2;
                star++;
            }

            // next line

            row++;
            System.out.println();
        }
    }
}
