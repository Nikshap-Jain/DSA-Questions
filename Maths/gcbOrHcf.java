package Maths;
//gcd (greatest common divisor) or hcf (highest common factor) are maximum number which divide two or more number without leaving a remainder.

//Code - Euclid algorithm

public class gcbOrHcf {
    public static void main(String[] args) {
        int divident = 60;
        int divisor = 36;

        while (divident % divisor != 0) {
            int remainder = divident % divisor;
            divident = divisor;
            divisor = remainder;
        }
        System.out.println("Hcf : " + divisor);
    }
}
