package RecursionAll.Recursion.Assignment;

import java.util.Arrays;

public class DictionaryOrderSmaller {
    public static void main(String[] args) {
        String s = "cba";
        char[] arr = s.toCharArray();
        String temp = s;
        Arrays.sort(arr);
        s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }

        print(s, "", s.length(), temp);
    }

    public static void print(String s, String ans, int n, String temp) {
        if (n == ans.length()) {
            for (char i = 0; i < ans.length(); i++) {
                if (ans.charAt(i) == temp.charAt(i)) {
                    continue;
                }
                if (ans.charAt(i) > temp.charAt(i)) {
                    return;
                } else {
                    System.out.println(ans);
                    return;
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            String si = s.substring(0, i);
            String se = s.substring(i + 1);
            print(si + se, ans + s.charAt(i), n, temp);
        }
    }
}
