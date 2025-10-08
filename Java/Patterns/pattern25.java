package Java.Patterns;

public class pattern25 {
    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;
        int row = 1;
        int star = 1;
        int count = 1;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print(count + "\t");
                j++;
                count++;
            }

            row++;
            star += 2;
            space--;
            System.out.println("");
        }
    }
}
