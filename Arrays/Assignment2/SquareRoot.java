package Arrays.Assignment2;

public class SquareRoot {
    public static void main(String[] args) {
        long n = 26;

        long low = 1;
        long high = n;
        long ans = 0;
        while (low <= high) {
            long mid = (high - low) / 2 + low;
            if (mid * mid == n) {
                ans = mid;
                break;
            } else if (mid * mid < n) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
