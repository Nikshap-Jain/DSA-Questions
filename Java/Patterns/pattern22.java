package Java.Patterns;

public class pattern22 {
    public static void main(String[] args) {
        int n = 5;
        int space = -1;
        int row = 1;
        int star = n;
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
            if (row == 1) {
                k = 2;
            }
            while (k <= star) {

                System.out.print("* ");
                k++;
            }

            row++;
            space += 2;
            star--;
            System.out.println("");
        }
    }
}
