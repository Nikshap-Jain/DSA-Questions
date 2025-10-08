package Java.SlidingWindow;
//Window size is fixed

public class MaxSumOfWindowSizeK {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 5, 7, 2, 3 };
        int k = 3;
        System.out.println(MaximumSum(arr, k));
    }

    public static int MaximumSum(int[] arr, int k) {
        int ans = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        ans = sum;
        for (int i = k; i < arr.length; i++) {

            // grow
            sum += arr[i];
            // shrink
            sum -= arr[i - k];
            // ans calculate
            ans = Math.max(ans, sum);
        }

        return ans;
    }
}
