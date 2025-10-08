package Arrays.Assignment2;
//Given an n x m matrix, where every row and column is sorted in increasing order, and a number x . Find if element x is present in the matrix or not.

public class MatrixSearch {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int m = sc.nextInt();
        // int n = sc.nextInt();
        // int arr[][] = new int[m][n];
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        int m = 4;
        int n = 4;

        int arr[][] = { { 11, 12, 13, 14 },
                { 21, 22, 23, 24 },
                { 31, 32, 33, 34 },
                { 41, 42, 43, 44 } };

        int target = 32;
        int i = 0;
        int j = n - 1;
        boolean flag = true;
        while (i <= m - 1 && j >= 0) {
            if (arr[i][j] == target) {
                System.out.println(1);
                flag = false;
                break;
            } else if (arr[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        if (flag) {
            System.out.println(0);
        }
    }
}