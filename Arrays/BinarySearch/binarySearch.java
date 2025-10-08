package Arrays.BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 7, 8, 23, 343, 999 };
        int min = 0;
        int max = arr.length - 1;
        int target = 999;
        boolean flag = true;
        while (min <= max) {
            int mid = ((max - min) / 2) + min;
            if (arr[mid] == target) {
                System.out.println(true);
                flag = false;
                break;
            } else if (arr[mid] > target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        if (flag) {
            System.out.println(false);
        }
    }
}
