package Java.Bitmasking.Questions;

public class tavasSaddasCodefor {
    public static void main(String[] args) {
        System.out.println(Index("474744"));
    }

    public static int Index(String s) {
        int n = s.length();
        int count = (1 << n) - 2;
        System.out.println(count);
        int pos = 0;
        for (int i = s.length() - 1; i >= 0; i--) {q
            if (s.charAt(i) == '7') {
                count += (1 << pos);
            }
            pos++;
        }
        return count + 1;
    }
}
