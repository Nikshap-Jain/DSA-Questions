package Arrays.BasicQuestions;

public class Rotate2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        rotate(nums, k);
        display(nums);
    }

    public static void rotate(int nums[], int k) {
        int n = nums.length;
        k = k % n;
        // starting n-k reverse
        reverse(nums, 0, n - k - 1);
        // last k reverse
        reverse(nums, n - k, n - 1);
        // total element reverse
        reverse(nums, 0, n - 1);
    }

    public static void reverse(int arr[], int i, int j) {
        while (j > i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void display(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
