package Maths.Assignment;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        // long n = 2212212;
        // byte digit = 2;
        // int count = 0;

        // while (n > 0) {
        // long rem = n % 10;
        // if (rem == digit) {
        // count++;
        // }
        // n = n / 10;
        // }
        // System.out.println(count);

        long n = 101010;
        long sum = 0;
        long mul = 1;
        while (n > 0) {
            long rem = n % 10;
            sum = sum + (mul * rem);
            mul = mul * 2;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
