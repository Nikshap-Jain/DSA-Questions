package RecursionAll.Recursion.RecursionIntermediate;

public class generateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        parentheses(n, 0, 0, "");
    }

    public static void parentheses(int n, int open, int closed, String ans) {
        if (open == n && closed == n) {
            System.out.println(ans);
            return;
        }

        if (open > n || closed > open) {
            return;
        }

        parentheses(n, open + 1, closed, ans + "(");
        parentheses(n, open, closed + 1, ans + ")");

    }
}
