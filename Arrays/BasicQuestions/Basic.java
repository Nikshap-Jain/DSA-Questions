package Arrays.BasicQuestions;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        display(arr);

        // another way to declare array
        int arr1[] = { 10, 20, 4, 9, 7 };
        int arr2[] = new int[] { 10, 20, 4, 9, 7 };
        System.out.println(arr);
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}