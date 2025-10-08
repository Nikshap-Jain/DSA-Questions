package Java.Patterns;

public class pattern32 {
    public static void main(String[] args) {
        int row = 1;
        int n = 9;
        int star = 1;
        int flag = 1;
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print(flag + " ");
                if (i != star) {
                    System.out.print("* ");
                }
                i++;
            }

            if (row <= n / 2) {
                flag++;
                star++;
            } else {
                flag--;
                star--;
            }
            row++;
            System.out.println();
        }
    }
}
