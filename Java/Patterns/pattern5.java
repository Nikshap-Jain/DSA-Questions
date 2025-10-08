package Java.Patterns;

public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int space = 0;
        int row = 1;
        while (row <= n) {
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            System.out.println("");
            row++;
            space++;
            star--;
        }
    }
}
