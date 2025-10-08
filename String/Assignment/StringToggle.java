package String.Assignment;

import Arrays.Assignment.sortjustZeroesandOnes;

public class StringToggle {
    public static void main(String[] args) {
        String str = "abC";
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            String temp = str.charAt(i) + "";
            if (Character.isUpperCase(str.charAt(i))) {
                ans += temp.toLowerCase();
            } else {
                ans += temp.toUpperCase();
            }
        }
        System.out.println(ans);
    }
}
