package RecursionAll.Recursion.Assignment;

public class NKnightProblem {
    public static void main(String[] args) {
        int n = 3;
        boolean ans[][] = new boolean[n][n];

        print(n, ans, 0, 0, 0);
    }

    public static void print(int n, boolean ans[][], int row, int col, int k) {
        if (row > n) {
            return;
        }
        if (k == n) {
            show(ans);
            return;
        }

        if (isCheck(ans, row, col)) {
            ans[row][col] = true;
            k++;
            if (col + 1 < n) {
                print(n, ans, row, col + 1, k);
            } else {
                print(n, ans, row + 1, 0, k);
            }
            ans[row][col] = false;
            k--;
        }

    }

    public static boolean isCheck(boolean ans[][], int row, int col) {

        if (row - 2 >= 0 && col + 1 < ans.length) {
            if (ans[row - 2][col + 1]) {
                return false;
            }
        }
        if (row - 2 >= 0 && col - 1 >= 0) {
            if (ans[row - 2][col - 1]) {
                return false;
            }
        }
        if (row - 1 >= 0 && col + 2 < ans.length) {
            if (ans[row - 1][col + 2]) {
                return false;
            }
        }
        if (row - 1 >= 0 && col - 2 < ans.length) {
            if (ans[row - 1][col - 2]) {
                return false;
            }
        }
        return true;
    }

    public static void show(boolean ans[][]) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
