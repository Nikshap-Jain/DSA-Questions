package Arrays.BasicQuestions;

public class max {
    public static void main(String[] args) {
        int arr[] = { 3, 34, 16, 757, 5 };
        System.out.println(max(arr));
    }

    public static int max(int arr[]) {
        int m = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // if (m < arr[i]) {
            // m = arr[i];
            // }
            m = Math.max(arr[i], m);// alternate way
        }
        return m;
    }
}
