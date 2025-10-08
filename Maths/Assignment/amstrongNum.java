package Maths.Assignment;

public class amstrongNum {
    public static void main(String[] args) {
        int num = 400;
        int num2 = 1000;

        for (int i = num; i <= num2; i++) {
            int temp = i;
            int digit = 0;
            while (temp > 0) {
                digit++;
                temp = temp / 10;
            }

            temp = i;

            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digit);
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.println(sum);
            }

        }
    }
}
