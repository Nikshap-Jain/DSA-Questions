package RecursionAll.Recursion.Assignment;

public class Replaceall0with5 {
    public static void main(String[] args) {
        int n = 103;
        System.out.println(convert(n));
    }

    public static int convert(int n) {
        if (n == 0) {
            return 0;
        }
        int last = n % 10;
        if (last == 0) {
            last = 5;
        }

        return convert(n / 10) * 10 + last;
    }
}
