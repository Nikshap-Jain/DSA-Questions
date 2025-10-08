package RecursionAll.Recursion.Assignment;

import java.util.*;

public class RemoveDuplicateAndSmallestLexographicalStr {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        print(s, "", "", 0);
    }

    public static String print(String s, String ans, String finalAns, int ansLen) {

        if (s.length() == 0) {
            // if (finalAns.length() == 0) {
            // finalAns = ans;
            // ansLen = ans.length();

            // } else if (ans.length() == ansLen) {
            // int val = ans.compareTo(finalAns);
            // if (val < 0) {
            // finalAns = ans;
            // }

            // }

            // System.out.println(finalAns);
            System.out.println(ans);
            return "";
        }

        for (int i = 0; i < s.length(); i++) {

            if (!ans.contains(String.valueOf(s.charAt(i)))) {
                print(s.substring(1), ans + s.charAt(i), finalAns, ansLen);

            } else {
                print(s.substring(1), ans, finalAns, ansLen);
            }
        }
        return finalAns;
    }
}
