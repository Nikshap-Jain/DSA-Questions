package Maths;

public class primeNum {
    public static void main(String[] args) {
        int num = 14;
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Prime number");
        }
    }
}
