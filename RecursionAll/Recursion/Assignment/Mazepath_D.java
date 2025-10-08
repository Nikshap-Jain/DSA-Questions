package RecursionAll.Recursion.Assignment;

public class Mazepath_D {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        print(row, col, "", 0, 0);
        System.out.println();
        System.out.println(count);
    }

    public static int count = 0;

    public static void print(int row, int col, String ans, int r, int c) {
        if (r == row - 1 && c == col - 1) {
            System.out.print(ans + " ");
            count++;
            return;
        }
        if (r >= row || c >= col) {
            return;
        }

        print(row, col, ans + 'V', r + 1, c);
        print(row, col, ans + 'H', r, c + 1);
        print(row, col, ans + 'D', r + 1, c + 1);

    }
}
