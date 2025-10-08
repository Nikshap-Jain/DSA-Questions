package Java.Patterns;

public class pattern17 {
    public static void main(String[] args) {
        // int n = 3;
        // int star = n;
        // int space = 1;
        // int row = 1;
        // while (row <= (2 * n) + 1) {
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
        // if (row <= n) {
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
        int star = n / 2;
        int space = 1;
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
            while (k <= star) {
                System.out.print("* ");
                k++;
            }

            // row++;
            // mirror
            if (row <= n / 2) {
                space += 2;
                star--;
            } else {
                space -= 2;
                star++;
            }

            // next line

            // row++;
            System.out.println();
        }
    }
}
