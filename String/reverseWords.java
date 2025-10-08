package String;

public class reverseWords {
    public static void main(String[] args) {
        String s = " the sky    is     blue";
        System.out.println(rev(s));
    }

    public static String rev(String s) {
        s = s.trim();

        String[] arr = s.split(" +");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i] + " ";
        }
        return ans.trim();
    }
}
