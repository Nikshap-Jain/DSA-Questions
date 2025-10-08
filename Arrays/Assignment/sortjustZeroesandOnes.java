package Arrays.Assignment;

public class sortjustZeroesandOnes {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 1, 0, 1 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (sum > 0) {
                arr[i] = 1;
                sum--;
            } else {
                arr[i] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Better Solution
        // int left = 0, right = n - 1;
        // while (left < right) {
        // if (arr[left] == 1 && arr[right] == 0) {
        // // swap
        // int temp = arr[left];
        // arr[left] = arr[right];
        // arr[right] = temp;
        // }
        // if (arr[left] == 0) left++;
        // if (arr[right] == 1) right--;
        // }
    }
}
