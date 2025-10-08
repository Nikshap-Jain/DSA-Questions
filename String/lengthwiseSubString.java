package String;

public class lengthwiseSubString {
    public static void main(String[] args) {
        String s = "coding";
        printAllSubString(s);// lengthwise
    }

    public static void printAllSubString(String s) {
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                System.out.println(s.substring(i, len));
            }
        }
    }
}
