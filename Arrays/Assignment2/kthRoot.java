package Arrays.Assignment2;

import java.util.Scanner;

public class kthRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long low = 1;
            long high = n;
            long ans = 1;
            while (low <= high) {
                long mid = (high - low) / 2 + low;
                if (Math.pow(mid, k) == n) {
                    ans = mid;
                    break;
                } else if (Math.pow(mid, k) < n) {
                    ans = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}
