package RecursionAll.Recursion;

public class isSortedArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 8 };
        int i = 0;
        System.out.println(isSorted(arr, i));
    }

    public static boolean isSorted(int arr[], int i) {
        if (arr.length - 1 == i) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);

    }
}
