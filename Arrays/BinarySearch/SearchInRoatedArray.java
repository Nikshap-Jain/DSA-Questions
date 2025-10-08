package Arrays.BinarySearch;

public class SearchInRoatedArray {
    public static void main(String[] args) {
        int nums[] = { 278, 280, 281, 286, 287, 290, 2, 3, 4, 8, 9, 14, 15, 16, 21, 24, 25, 31, 32, 34, 36, 37, 42, 45,
                51, 52, 54, 55, 60, 63, 66, 68, 69, 71, 76, 81, 83, 84, 85, 86, 87, 94, 97, 99, 106, 107, 110, 113, 114,
                115, 118, 120, 121, 125, 134, 136, 137, 138, 142, 143, 147, 150, 152, 159, 160, 161, 165, 166, 174, 176,
                178, 186, 187, 189, 190, 191, 195, 196, 198, 204, 212, 216, 217, 220, 221, 222, 225, 227, 229, 232, 237,
                239, 242, 245, 251, 263, 264, 274, 275, 276, 277 };
        int target = 286;
        int pivot = pivotPoint(nums);
        int ans = binarySearch(0, pivot - 1, nums, target);
        int ans2 = binarySearch(pivot, nums.length - 1, nums, target);
        if (ans != -1) {
            System.out.println(ans);
        } else if (ans2 != -1) {
            System.out.println(ans2);
        } else {
            System.out.println("-1");
        }
    }

    public static int pivotPoint(int nums[]) {
        int max = nums.length - 1;
        int min = 0;
        if (nums[max] >= nums[min]) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            int mid = (max - min) / 2 + min;
            if (nums[min] <= nums[mid]) {
                if (nums[mid] < nums[mid + 1]) {
                    min = mid + 1;
                } else {
                    return mid + 1;
                }
            } else {
                if (nums[mid] <= max) {
                    if (nums[mid] > nums[mid - 1]) {
                        max = mid - 1;
                    } else {
                        return mid;
                    }
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }

    public static int binarySearch(int min, int max, int nums[], int target) {
        while (min <= max) {
            int mid = (max - min) / 2 + min;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}