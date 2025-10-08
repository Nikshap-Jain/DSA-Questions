package String.Assignment;

public class NoOfWordInCamelCaseString {
    public static void main(String[] args) {
        String str = "IAmACompetitiveProgrammer";

        String word = "";
        word += str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) >= 97) {
                word += str.charAt(i);
            } else {
                System.out.println(word);
                word = "";
                word += str.charAt(i);
            }
        }
        System.out.println(word);

    }
}
