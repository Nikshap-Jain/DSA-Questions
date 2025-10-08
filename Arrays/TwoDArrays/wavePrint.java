package Arrays.TwoDArrays;

public class wavePrint {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 9, 10, 11, 12 } };
        int[][] arr2 = new int[][] { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 9, 10, 11, 12 } };// same as arr
        print(arr);
    }

    public static void print(int arr[][]) {
        boolean flag = true;
        int row = 0;
        for (int column = 0; column < arr[0].length; column++) {
            if (flag) {
                for (row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][column] + " ");
                }
                flag = false;
            }

            else {
                for (row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][column] + " ");
                }
            }
            System.out.println();
        }
    }

}
