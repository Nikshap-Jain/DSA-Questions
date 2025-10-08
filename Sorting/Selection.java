package Sorting;

//minimum select krte hai issi liye selection sort and minimum index ko shi jagah swap kr dete hai.
public class Selection {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 2, 1 };
        // miniIdx(arr, 2);
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int mini = miniIdx(arr, i);
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }

    public static int miniIdx(int arr[], int index) {
        int mini = index;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[mini] > arr[i]) {
                mini = i;
            }
        }
        return mini;
    }
}
