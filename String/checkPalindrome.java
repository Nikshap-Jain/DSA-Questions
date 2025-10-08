package String;

public class checkPalindrome {
    public static void main(String[] args) {
        String s = "naan";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(i)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
