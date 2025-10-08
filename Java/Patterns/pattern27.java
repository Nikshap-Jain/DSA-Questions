package Java.Patterns;

public class pattern27 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n - 1;
        int star = 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            int flag = 1;

            while (j <= star) {
                System.out.print(flag + " ");

                if (j <= star / 2) {
                    flag++;
                } else {
                    flag--;
                }
                j++;
            }

            row++;
            star += 2;
            space--;

            System.out.println("");
        }
    }
}
