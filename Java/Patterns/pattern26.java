package Java.Patterns;

public class pattern26 {
    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;
        int row = 1;
        int star = 1;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print(j + " ");
                j++;
            }

            row++;
            star += 2;
            space--;
            System.out.println("");
        }
    }
}
