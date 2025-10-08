package Java.Patterns;

public class pattern16 {
    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;
        int row = 1;
        int star = n;
        while (row <= (2 * n) - 1) {
            // space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            // star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            // mirror
            if (row < n) {
                star--;
                space--;
            } else {
                star++;
                space++;
            }

            System.out.println();
            row++;
        }
    }
}
