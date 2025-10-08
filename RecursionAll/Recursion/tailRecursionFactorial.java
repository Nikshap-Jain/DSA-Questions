package RecursionAll.Recursion;

// tail recursion last execution should be recurrsive call.
// head : other than tail is head.
public class tailRecursionFactorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fac(n, 1));
    }

    public static int Fac(int n, int ans) {
        if (n == 0) {
            return ans;
        }

        return Fac(n - 1, ans * n);
    }
}
