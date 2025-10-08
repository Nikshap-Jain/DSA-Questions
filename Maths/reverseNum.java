package Maths;

public class reverseNum {
    public static void main(String[] args) {
        int num = 12345;
        int newNum = 0;
        while (num > 0) {
            int rem = num % 10;
            newNum = newNum * 10 + rem;
            num = num / 10;
        }
        System.out.println(newNum);
    }
}
