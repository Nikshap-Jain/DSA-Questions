package Maths;

public class primeFactor {
    public static void main(String[] args) {
        int n = 378;
        int i = 2;
        while (n > 1) { // or i <= n
            if (n % i == 0) {
                n = n / i;
                System.out.println(i);
            } else {
                i++;
            }
        }
    }
}
