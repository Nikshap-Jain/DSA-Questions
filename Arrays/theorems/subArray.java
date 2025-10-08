package Arrays.theorems;

public class subArray {
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans = maximum(arr);
        System.out.println(ans);
    }

    // public static int maximum(int arr[]) {
    // int ans = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // int sum = 0;
    // for (int j = i; j < arr.length; j++) {
    // sum += arr[j];
    // ans = Math.max(ans, sum);
    // }
    // }
    // return ans;
    // }

    // Kadance's Algorithm
    public static int maximum(int arr[]) {
        int ans = arr[0];
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
