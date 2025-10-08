package Arrays.BasicQuestions;

public class reverse {
    public static void main(String[] args) {
        int arr[] = { 3, 34, 16, 757, 5 };
        rev(arr);
        display(arr);
    }

    public static void rev(int arr[]) {
        int len = arr.length - 1;
        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            len--;
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
