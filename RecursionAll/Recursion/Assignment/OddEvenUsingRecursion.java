package RecursionAll.Recursion.Assignment;

public class OddEvenUsingRecursion {
    public static void main(String[] args) {
        int n = 10;
        print(n, n);
    }

    public static void print(int n, int odd) {
        if (odd == 0) {
            return;
        }
        if (odd % 2 != 0) {
            System.out.println(odd);
        }

        print(n, odd - 1);
        if (odd % 2 == 0) {
            System.out.println(odd);
        }

    }
}
