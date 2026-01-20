package Stack.Converstions;

import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)";
        Stack<Character> st = new Stack<>();
        String ans = "";
        int i = 0;
        while (i < s.length()) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                ans += s.charAt(i);

            } else if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                while (!s.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                st.pop();
            } else {

                while (!st.isEmpty() && (priority(st.peek()) > priority(s.charAt(i)))) {

                    ans += st.pop();

                }
                st.push(s.charAt(i));
            }

            i++;
        }
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        System.out.println(ans);
    }

    public static int priority(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '*' || c == '/' || c == '%') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else {
            return -1;
        }
    }
}
