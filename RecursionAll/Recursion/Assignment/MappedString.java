package RecursionAll.Recursion.Assignment;

public class MappedString {
    public static void main(String[] args) {
        String hash[] = { "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z" };
        int n = 1234;
        String s = n + "";
        convert(s, hash, "");
    }

    public static void convert(String s, String hash[], String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        int i = s.charAt(0) - 48;
        String alp = hash[i];

        convert(s.substring(1), hash, ans + alp);
        if (s.length() >= 2) {
            int i2 = s.charAt(1) - 48;
            if (i * 10 + i2 < hash.length) {
                convert(s.substring(2), hash, ans + hash[i * 10 + i2]);
            }
        }
    }
}
