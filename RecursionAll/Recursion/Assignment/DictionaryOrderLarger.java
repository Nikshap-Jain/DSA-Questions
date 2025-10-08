package RecursionAll.Recursion.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class DictionaryOrderLarger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String temp = s;
        char c[] = s.toCharArray();
        Arrays.sort(c);
        s = "";
        for (int i = 0; i < c.length; i++) {
            s += c[i];
        }
        print(s, "", temp, 0);
    }

    public static void print(String s, String ans, String temp, int i) {
        if (ans.length() == temp.length()) {
            if (ans.compareTo(temp) > 0) {
                System.out.println(ans);
            }
            return;
        }
        if (i >= s.length()) {
            return;
        }

        String si = s.substring(0, i);
        String se = s.substring(i + 1);

        print(si + se, ans + s.charAt(i), temp, 0);
        print(s, ans, temp, i + 1);
    }
}
