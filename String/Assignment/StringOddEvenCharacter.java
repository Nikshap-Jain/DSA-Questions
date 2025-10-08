package String.Assignment;

import java.util.Scanner;

public class StringOddEvenCharacter {
    public static void main(String[] args) {
        // String str = "cg";
        // String word = "";
        // boolean flag = true;
        // for (int i = 0; i < str.length(); i++) {
        // if (flag) {

        // char c = (char) (str.charAt(i) + 1);
        // word += c;
        // flag = false;
        // } else {
        // flag = true;
        // char c = (char) (str.charAt(i) - 1);
        // word += c;
        // }
        // }
        // System.out.println(word);

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String word = "";
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char c = 0;
            if (flag) {
                if (str.charAt(i) == 'z') {
                    c = 'a';
                } else {
                    c = (char) (str.charAt(i) + 1);
                }

                flag = false;
            } else {
                flag = true;
                if (str.charAt(i) == 'a') {
                    c = 'z';
                } else {
                    c = (char) (str.charAt(i) - 1);
                }
            }
            word += c;

        }
        System.out.println(word);
    }
}
