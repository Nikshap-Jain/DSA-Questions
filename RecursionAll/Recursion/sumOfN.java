package RecursionAll.Recursion;

public class sumOfN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int ans = sum(n - 1);
        return n + ans;
    }
}
