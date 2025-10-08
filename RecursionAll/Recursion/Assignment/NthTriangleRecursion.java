package RecursionAll.Recursion.Assignment;

public class NthTriangleRecursion {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(tri(n));
        tri2(n, 0);
    }

    public static int tri(int n) {
        if (n == 1) {
            return 1;
        }

        return n + tri(n - 1);
    }

    public static void tri2(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }

        tri2(n - 1, sum + n);
    }
}
