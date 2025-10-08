package String.Assignment;

public class palindrome {
    public static void main(String[] args) {
        String str = "ab";
        int low = 0;
        int high = str.length() - 1;
        boolean flag = true;
        while (low <= high) {
            if (str.charAt(low) == str.charAt(high)) {
                low++;
                high--;
            } else {
                System.out.println(false);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(true);
        }
    }
}
