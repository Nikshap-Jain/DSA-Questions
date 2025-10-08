package RecursionAll.Recursion.RecursionIntermediate;

public class boardPath {
    public static void main(String[] args) {
        int n = 4;
        print(n, 0, "");
    }

    public static void print(int n, int curr, String ans) {
        if (curr == n) {
            System.out.println(ans);
            return;
        }
        if (curr > n) {
            return;
        }

        print(n, curr + 1, ans + 1);
        print(n, curr + 2, ans + 2);
        print(n, curr + 3, ans + 3);
    }
}
