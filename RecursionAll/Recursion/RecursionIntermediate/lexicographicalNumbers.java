package RecursionAll.Recursion.RecursionIntermediate;

import String.lexicographical;

public class lexicographicalNumbers {
    public static void main(String[] args) {
        int n = 1000;
        lexicographical(0, n);
    }

    public static void lexicographical(int curr, int n) {
        if (curr > n) {
            return;
        }

        System.out.println(curr);
        int i = 0;
        if (curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            lexicographical(curr * 10 + i, n);
        }
    }
}
