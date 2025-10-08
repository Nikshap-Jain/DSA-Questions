package String.Assignment;

import Arrays.Assignment.sortjustZeroesandOnes;

public class StringRemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabccba";
        String word = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                continue;
            } else {
                word += String.valueOf(str.charAt(i));
            }
        }
        System.out.println(word);
    }
}
