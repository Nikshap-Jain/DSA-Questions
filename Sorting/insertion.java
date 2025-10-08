package Sorting;

// last element ko shi jagah insert krenge basically 2 arrays lenge 
public class insertion {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 4, 5, 9, 6, 2 };
        // miniIdx(arr, 2);
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void insertLastElement(int arr[], int lastIdx) {
        int i = lastIdx - 1;
        int item = arr[lastIdx];
        while (i >= 0 && arr[i] > item) {
            arr[i + 1] = arr[i];
            arr[i] = item;
            i--;
        }
    }

    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            insertLastElement(arr, i);
        }
    }
}
