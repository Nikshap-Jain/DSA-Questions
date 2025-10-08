package Maths.Assignment;

import java.util.Scanner;

public class inverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(inverse(n));
    }

    public static int inverse(int n) {
        int sum = 0;
        int pos = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += pos * Math.pow(10, rem - 1);
            n /= 10;
            pos++;
        }
        return sum;
    }
}
