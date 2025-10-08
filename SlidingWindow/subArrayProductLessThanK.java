package Java.SlidingWindow;

public class subArrayProductLessThanK {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 4, 3 };
        int k = 10;
        System.out.println(product(arr, k));
    }

    public static int product(int[] arr, int k) {
        int ei = 0, si = 0, ans = 0, p = 1;

        while (ei < arr.length) {

            // grow
            p *= arr[ei];

            // shrink
            while (p >= k && si <= ei) {
                p /= arr[si];
                si++;
            }
            // calculate ans
            ans += (ei - si + 1);
            ei++;
        }

        return ans;
    }
}
