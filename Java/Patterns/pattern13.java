package Java.Patterns;

public class pattern13 {
    public static void main(String[] args) {
        // int n = 9;
        // int star = 1;
        // int row = 1;
        // int flag = 3;
        // while (row <= n) {
        // int i = 1;
        // if (row > 5) {
        // i = flag;
        // flag += 2;
        // }
        // while (i <= star) {
        // System.out.print("* ");
        // i++;
        // }

        // row++;
        // System.out.println("");
        // star++;
        // }

        int n = 5;
        int star = 1;
        int row = 1;
        while (row <= (2 * n) - 1) {
            int i = 1;
            while (i <= star) {
                System.out.print("*");
                i++;
            }

            // mirror
            if (row < n) {
                star++;
            } else {
                star--;
            }
            System.out.println("");
            row++;
        }
    }
}
