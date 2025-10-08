package Maths.Assignment;

public class oddPlaceEvenPlace {
    public static void main(String[] args) {
        int n = 23551;
        int i = 0;
        int evenSum = 0;
        int oddSum = 0;
        boolean flag = false;
        while (n > 0) {
            int rem = n % 10;
            if (flag == false) {
                oddSum += rem;
                flag = true;
            } else {
                evenSum += rem;
                flag = false;
            }
            n = n / 10;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
