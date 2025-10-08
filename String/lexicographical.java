package String;

public class lexicographical {
    public static void main(String[] args) {
        String s1 = "kunal";
        String s2 = "komal";
        System.out.println(s1.compareTo(s2));// +ve s1 > s2 | s1 < s2 -ve
        // ascii ka difference ara

        String s3 = "ankit";
        String s4 = "ankita";
        System.out.println(compareToo(s1, s2));
    }

    // We will write our compareTo

    public static int compareToo(String s1, String s2) {
        if (s1 == s2) {
            return 0;
        }
        int n = Math.min(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }
}
