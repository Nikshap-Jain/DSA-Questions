package BackTracking.Leetcode;

public class nQueen {
    public static void main(String[] args) {
        int n = 4;
        int arr[][] = new int[n][n];
        print(arr, 0, n);
    }

    public static void print(int arr[][], int row, int n) {
        if (n == 0) {
            show(arr);
            return;
        }
        if (row == arr.length) {
            return;
        }

        for (int j = 0; j < arr.length; j++) {
            if (check(j, row, arr)) {
                arr[row][j] = 1;
                print(arr, row + 1, n - 1);
                arr[row][j] = 0;
            }
        }
    }

    public static boolean check(int col, int row, int arr[][]) {
        // horizontal
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 1) {
                return false;
            }
        }

        // right diagonal
        int i = row - 1;
        int j = col + 1;
        while (i >= 0 && j < arr.length) {
            if (arr[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }

        // left diagonal
        i = row - 1;
        j = col - 1;
        while (i >= 0 && j >= 0) {
            if (arr[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }

        return true;
    }

    public static void show(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
