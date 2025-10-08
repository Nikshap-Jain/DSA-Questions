package Arrays.BinarySearch;

//Ques : kth root
public class KthRoot {
    public static void main(String[] args) {
        int k = 3;
        int N = 149;
        int max = N;
        int min = 1;
        int ans = -1;
        while (min <= max) {
            int mid = ((max - min) / 2) + min;
            if (Math.pow(mid, k) <= N) {
                ans = mid;
                min = mid + 1;

            } else {
                max = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
