package Java.Patterns;

public class pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int space = (2 * n) - 3;
        int row = 1;
        int star = 1;
        while (row <= 5) {
            // star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while (k <= star) {
                if (k != n) {
                    System.out.print("* ");
                }
                k++;
            }

            row++;
            space -= 2;
            star++;
            System.out.println("");
        }
    }
}
