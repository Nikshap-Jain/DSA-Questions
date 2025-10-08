package RecursionAll.Recursion.Assignment;

public class RecursionLexicographicalOrder {
    public static void main(String[] args) {
        int n = 10;
        print(n, 0);
    }

    public static void print(int n, int ans) {
        if (ans >= n) {
            return;
        }

        int i;
        if (ans == 0) {
            i = 1;
        } else {
            i = 0;
        }

        for (; i < 10; i++) {
            ans = ans * 10 + i;
            if (ans <= n) {
                System.out.print(ans + " ");
            }
            print(n, ans);
            ans = ans / 10;
        }

    }
}
