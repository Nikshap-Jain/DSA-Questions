package RecursionAll.Recursion.Assignment;

public class RecursionTwins {
    public static void main(String[] args) {
        int count = 0;
        String s = "AxAxAyAyAA";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.substring(0, i).contains(c + "")) {
                continue;
            }
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
