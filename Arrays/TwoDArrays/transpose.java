package Arrays.TwoDArrays;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        display(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
            System.out.println();
        }
        display(arr);

    }

    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
