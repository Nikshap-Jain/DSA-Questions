import java.util.*;

public class revision {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 9, 1, 2, 4, 6, 8, 3 };
        int t = 10;
        System.out.println("N");
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int num = t - (arr[i] + arr[j]);
                System.out.println(num);
                if (arr[j] <= num) {
                    // binary search
                    int low = j + 1;
                    int high = arr.length - 1;
                    while (low <= high) {
                        int mid = (high - low) / 2 + low;
                        if (arr[mid] == num) {
                            System.out.println(arr[i] + ", " + arr[j] + " and " + num);
                            break;
                        } else if (arr[low] > arr[mid]) {
                            low = mid + 1;
                        } else {
                            high = mid - 1;
                        }
                    }
                } else {
                    break;
                }
            }
        }
    }

}
