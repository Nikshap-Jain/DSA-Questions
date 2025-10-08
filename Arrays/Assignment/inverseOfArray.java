package Arrays.Assignment;

public class inverseOfArray {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 4, 1, 3 };
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
}
