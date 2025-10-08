package Arrays.BasicQuestions;

public class sum {
    public static void main(String[] args) {
        int arr[] = { 3, 34, 16, 757, 5 };
        sum(arr);
    }

    public static void sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
