package RecursionAll.Recursion.RecursionIntermediate;

import java.util.*;

public class letter_combinations_of_a_phone_number {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main(String[] args) {
        String ques = "239";
        List<String> ll = new ArrayList<>();
        letterCombination(ques, "", ll);
    }

    public static void letterCombination(String ques, String ans, List<String> ll) {
        if (ques.length() == 0) {
            System.out.println(ans);
            ll.add(ans);
            return;
        }

        char ch = ques.charAt(0);
        String press = key[ch - '0'];
        for (int i = 0; i < press.length(); i++) {
            letterCombination(ques.substring(1), ans + press.charAt(i), ll);
        }
    }
}
