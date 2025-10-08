package Arrays.Assignment;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = { 1, 2, 3, 4 };
        long out[] = new long[n];
        long mul = 1;
        for (int i = 0; i < n; i++) {
            mul *= arr[i];
        }

        for (int i = 0; i < n; i++) {
            out[i] = mul / arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
