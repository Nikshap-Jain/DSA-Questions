package ArrayList;

import java.util.ArrayList;

public class ArraySumOfTwoArray {
    // treat two arrays as number and sum
    public static void main(String[] args) {

        int[] arr = { 1, 0, 2, 9 };
        int[] arr2 = { 3, 4, 5, 6, 7 };
        Sum(arr, arr2);
    }

    public static void Sum(int[] arr, int arr2[]) {
        ArrayList<Integer> ll = new ArrayList<>();
        int i = arr.length - 1, j = arr2.length - 1;
        int carry = 0;

        while (i >= 0 && j >= 0) {
            int sum = arr[i] + arr2[j] + carry;
            ll.add(sum % 10);
            carry = sum / 10;
            j--;
            i--;
        }

        while (j >= 0) {
            int sum = (arr2[j] + carry);
            ll.add(sum % 10);
            carry = sum / 10;
            j--;
        }
        while (i >= 0) {
            int sum = (arr2[i] + carry);
            ll.add(sum % 10);
            carry = sum / 10;
            i--;
        }

        if (carry != 0) {
            ll.add(carry);
        }

        for (int k = ll.size() - 1; k >= 0; k--) {
            System.out.println(ll.get(i) + " ");
        }
    }
}
