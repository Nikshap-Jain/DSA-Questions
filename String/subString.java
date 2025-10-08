package String;

public class subString {
    public static void main(String[] args) {
        String s = "coding";
        System.out.println(s.substring(0, 2));// last not include
        printAllSubString(s);
    }

    public static void printAllSubString(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
