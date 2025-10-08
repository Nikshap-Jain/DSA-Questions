package Maths.Assignment;

public class LCM {
    public static void main(String[] args) {
        long num1 = 4;
        long num2 = 6;
        long rem = 1;

        long lcm = num1 * num2;
        while (rem > 0) {
            rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        lcm = lcm / num1;
        System.out.println(lcm);
    }
}
