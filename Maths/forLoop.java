package Maths;

public class forLoop {

    public static void main(String[] args) {
        // there are four ways of writing for loop

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int i = 0;
        for (; i < 5; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < 5;) {
            System.out.println(j);
            j++;
        }

        int k = 0;
        for (; k < 5;) {
            System.out.println(k);
            k++;
        }
    }
}