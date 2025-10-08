package Maths.Assignment;

public class replace {
    // replace zero by five

    public static void main(String[] args) {
        long n = 12;
        long nn = 0;
        long mul = 1;
        if (n == 0) {
            nn = 5;
        } else {
            while (n > 0) {
                int rem = (int) (n % 10);
                if (rem == 0) {
                    rem = 5;
                }
                nn = nn + rem * mul;
                mul = mul * 10;
                n = n / 10;
            }

        }
        System.out.println(nn);
    }
}
