package Oops.Inheritance;

public class addition {
    public static void main(String[] args) {
        System.out.println(add(2, 7));
        System.out.println(add(23, 23f, 2));
        System.out.println(add(1, 2, 2, 2, 2, 2, 2, 2, 2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, float b, int c) {
        return (int) (a + b + c);
    }

    public static int add(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

}
