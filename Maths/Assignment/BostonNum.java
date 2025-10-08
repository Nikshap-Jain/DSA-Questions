package Maths.Assignment;

public class BostonNum {
    public static void main(String[] args) {
        int n = 22;
        int temp = n;
        int sum = 0;

        while (temp > 1) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }

        int i = 2;
        int pSum = 0;
        while (n > 1) {
            if (n % i == 0) {
                if (i < 10) {
                    pSum += i;
                } else {
                    int flag = i;
                    int flagSum = 0;
                    while (flag > 0) {
                        flagSum += flag % 10;
                        flag /= 10;
                    }
                    pSum += flagSum;
                }
                n /= i;
            } else {
                i++;
            }
        }
        if (pSum == sum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
