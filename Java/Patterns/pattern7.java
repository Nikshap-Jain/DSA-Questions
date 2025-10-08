package Java.Patterns;

public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int row = 1;
        while (row <= n) {
            // star
            int j = 1;
            while (j <= star) {
                if (row == 1 || row == n) {
                    System.out.print("* ");
                } else {
                    if (j != 1 && j != n) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                j++;
            }

            row++;
            System.out.println("");

        }

    }
}
