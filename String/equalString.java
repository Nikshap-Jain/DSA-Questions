package String;

public class equalString {
    public static void main(String[] args) {
        String s1 = " Hello";// Pooling
        String s3 = " Hello";// Pooling
        String s2 = new String("Hello");

        System.out.println(s1.equals(s3));// check content
        System.out.println(s1 == s3);// check address + content
        equals(s1, s2);
    }

    // equals method define in java in this way

    public static boolean equals(String s1, String s2) {
        if (s1 == s2) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
