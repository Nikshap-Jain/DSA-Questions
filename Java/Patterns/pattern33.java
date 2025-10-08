package Java.Patterns;

public class pattern33 {
    public static void main(String[] args) {
        int n = 10;
        int star = 1;
        int row = 1;
        int space = n - 1;
        int flag = n;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int innerFlag = flag;
            while (j <= star) {
                if (j == star / 2 + 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print(innerFlag + " ");
                }

                if (j <= star / 2) {
                    innerFlag++;
                } else {
                    innerFlag--;
                }
                j++;

            }

            row++;
            space--;
            star += 2;
            flag--;
            System.out.println();
        }
    }
}
