package Maths.Assignment;

public class AnyToAnyConversion {
    public static void main(String[] args) {
        int sb = 10;
        int db = 2;
        int sn = 27;

        int temp = sn;
        int mul = 1;
        int sum = 0;
        // any to decimal
        if (sb != 10 && db != 10) {

            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + mul * rem;
                mul = mul * sb;
                temp /= 10;
            }
            sb = 10;
            temp = sum;
        }
        System.out.println(sum);
        mul = 1;
        sum = 0;
        while (temp > 0) {
            int rem = temp % db;
            sum = sum + mul * rem;
            mul *= sb;
            temp /= db;
        }

        System.out.println(sum);
    }
}
