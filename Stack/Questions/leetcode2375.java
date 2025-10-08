package Java.Stack.Questions;

import java.util.Stack;

public class leetcode2375 {
    public static void main(String[] args) {
        String str = "IIIDIDDD";
        System.out.println(constructSmallerNumber(str));
    }

    public static String constructSmallerNumber(String s) {
        int[] ans = new int[s.length() + 1];
        Stack<Integer> st = new Stack<>();
        int c = 1;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == 'I') {
                ans[i] = c++;
                while (!st.isEmpty()) {
                    ans[st.pop()] = c++;
                }
            } else {
                st.push(i);
            }
        }
        String str = "";
        for (int v : ans) {
            str += v;
        }
        return str;
    }
}
