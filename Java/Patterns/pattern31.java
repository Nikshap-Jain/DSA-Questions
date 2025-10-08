package Java.Patterns;

public class pattern31 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int row = 1;
        while (row <= n) {
            int i = 1;
            int j = n;
            while (i <= star) {
                if (j != row) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("* ");
                }
                i++;
                j--;
            }
            System.out.println("");
            row++;
        }

    }
}
