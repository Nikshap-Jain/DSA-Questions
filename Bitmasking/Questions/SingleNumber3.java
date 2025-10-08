package Java.Bitmasking.Questions;

public class SingleNumber3 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 2, 3 };

    }

    public static int[] SingleNumber(int[] nums) {

        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        int mask = (xor & (-xor));
        int a = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((mask & nums[i]) != 0) {
                a ^= nums[i];
            }
        }
        int b = xor ^ a;
        return new int[] { a, b };
    }
}
