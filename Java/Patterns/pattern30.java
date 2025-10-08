package Java.Patterns;

public class pattern30 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int row = 0;
        while (row < n) {
            int i = 1;
            int j = n;
            while (i <= star) {
                System.out.print(j + " ");
                i++;
                j--;
            }
            System.out.println("");
            row++;
        }
    }
}
