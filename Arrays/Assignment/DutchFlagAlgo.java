package Arrays.Assignment;

public class DutchFlagAlgo {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 1, 2 };
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {
            if (nums[mid] == 0) {
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
