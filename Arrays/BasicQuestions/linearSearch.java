package Arrays.BasicQuestions;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 7, 9, 11, 45, 7 };
        int item = 7;
        System.out.println(search(arr, item));
    }

    public static int search(int arr[], int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
