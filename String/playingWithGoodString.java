package String;

import java.util.Scanner;

public class playingWithGoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        longestLength(s);
    }

    public static int longestLength(String s) {
        int ans = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Isvowels(ch)) {
                c++;
                ans = Math.max(ans, c);
            } else {
                c = 0;
            }
        }
        return ans;
    }

    public static boolean Isvowels(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
