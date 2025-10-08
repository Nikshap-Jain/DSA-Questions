package Maths;

public class fibo {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int n = 6;
        int sum = 0;
        // System.out.println(0);
        for (int i = 0; i < n; i++) {

            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println(num1);
    }
}
