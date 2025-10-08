package String.Assignment;

public class vowelSubStringLen {
    public static void main(String[] args) {
        String str = "cbaeicde";
        int ans = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        ans = Math.max(ans, count);
        System.out.println(ans);

    }
}
