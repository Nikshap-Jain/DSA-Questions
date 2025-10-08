package RecursionAll.Recursion.Assignment;

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        String s = "1??0?101";

        print(s.toCharArray(), 0);
    }

    public static void print(char[] s, int idx) {
        if (idx == s.length) {
            String ans = new String(s);
            System.out.print(ans + " ");
            return;
        }

        if (s[idx] == '?') {
            s[idx] = '0';
            print(s, idx + 1);

            s[idx] = '1';
            print(s, idx + 1);

            s[idx] = '?';
        } else {
            print(s, idx + 1);
        }
    }
}
