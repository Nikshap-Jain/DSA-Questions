package RecursionAll.Recursion.RecursionIntermediate;
// We can use static variable to do this because it is global.

public class countSubsequence {
    public static void main(String[] args) {
        String ques = "abc";
        print(ques, "");
        System.out.println("\n" + val);
    }

    static int val = 0;

    public static void print(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            val++;
            return;
        }
        char ch = ques.charAt(0);
        print(ques.substring(1), ans);
        print(ques.substring(1), ans + ch);
    }
}