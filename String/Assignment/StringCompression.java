package String.Assignment;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbccdsaa";
        String word = String.valueOf(str.charAt(0));
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                count++;
            } else {
                word += count;
                word += str.charAt(i);
                count = 1;
            }
        }
        word += count;
        System.out.println(word);
    }
}
