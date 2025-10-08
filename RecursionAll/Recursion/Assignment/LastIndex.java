package RecursionAll.Recursion.Assignment;

import java.util.Scanner;

import Maths.Assignment.replace;

public class LastIndex {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();
        String s = "xpipippixx";
        replace(s, 0, "");
    }

    public static void replace(String s, int idx, String ans) {
        if (s.length() == idx) {
            System.out.println(ans);
            return;
        }
        if (s.charAt(idx) == 'p') {
            if (idx + 1 < s.length() && s.charAt(idx + 1) == 'i') {
                String se = s.substring(idx + 2);
                ans += "3.14";
                idx += 2;
            } else {
                ans += s.charAt(idx);
                idx += 1;
            }
        } else {
            ans += s.charAt(idx);
            idx += 1;
        }
        replace(s, idx, ans);
    }
}
