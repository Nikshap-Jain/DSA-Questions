package Java.Patterns;

public class pattern29 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = n - 1;
        int row = 1;

        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                if (j == 1 || j == star) {
                    System.out.print(row + " ");
                } else {
                    System.out.print("0 ");
                }
                j++;
            }

            row++;
            System.out.println();
            star += 2;
            space--;
        }
    }
}
