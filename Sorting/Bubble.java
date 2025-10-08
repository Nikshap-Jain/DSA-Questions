package Sorting;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 2, 1 };
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {
        int temp = 0;
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

}