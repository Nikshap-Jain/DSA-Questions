package Arrays.BasicQuestions;

public class callByValue {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int arr1[] = { 100, 200, 500 };

        System.out.println(arr[0] + " " + arr1[0]);
        swap(arr, arr1);
        System.out.println(arr[0] + " " + arr1[0]);// no change so if change of reference will be done and its scope is
                                                   // till swap () only so it don't work

        // So java is always change in value.

    }

    public static void swap(int[] arr, int[] other) {
        int[] temp = arr;
        arr = other;
        other = temp;
    }
}
