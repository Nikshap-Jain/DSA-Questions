package Arrays.BasicQuestions;

public class Rotate {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        rotate(nums, k);
        display(nums);
    }

    public static void rotate(int nums[], int k) {
        int n = nums.length;
        k = k % n;

        for (int j = 1; j <= k; j++) {
            int temp = nums[n - 1];
            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
        }
    }

    public static void display(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}