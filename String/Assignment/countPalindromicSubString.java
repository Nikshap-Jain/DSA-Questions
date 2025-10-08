package String.Assignment;

public class countPalindromicSubString {
    public static void main(String[] args) {
        String s = "abc";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String temp = s.substring(i, j + 1);
                if (isPalindrome(temp)) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
