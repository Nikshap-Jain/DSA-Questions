package Java.Patterns;

public class pattern28 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = n - 1;
        int row = 1;

        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }
            // star
            int j = 1;
            int flag = row;
            while (j <= star) {
                System.out.print(flag + "\t");

                if (j <= star / 2) {
                    flag++;
                } else {
                    flag--;
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
