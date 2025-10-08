package Arrays.Assignment;

public class maxSumSubarrCirArr {
    public static void main(String[] args) {
        int arr[] = { -3, -2, -3 };
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int end = (i + n - 1) % n;
            int sum = 0;
            for (int j = i; j != end; j = (j + 1) % n) {
                sum += arr[j];
                if (sum < 0) {
                    sum = 0;
                }
                ans = Math.max(ans, sum);
            }
            if (arr[end] > 0) {
                sum += arr[end];
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
}
