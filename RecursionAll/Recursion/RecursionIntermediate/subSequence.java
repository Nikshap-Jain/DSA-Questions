package RecursionAll.Recursion.RecursionIntermediate;

public class subSequence {

    // subSquence of string is forward group of char of string not needed to be
    // continuous but should be forward

    // ex - abc - ac is also subsequence with all substrings

    // All substrings are subsequence but not all subsequence are not substring.
    public static void main(String[] args) {
        String ques = "abc";
        print(ques, "");
    }

    public static void print(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        print(ques.substring(1), ans);
        print(ques.substring(1), ans + ch);
    }
}
