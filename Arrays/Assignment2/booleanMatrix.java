package Arrays.Assignment2;

import java.util.Scanner;

public class booleanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // boolean rows[] = new boolean[m];
        // boolean columns[] = new boolean[n];

        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // if (arr[i][j] == 1) {
        // rows[i] = true;
        // columns[j] = true;
        // }
        // }
        // }

        // // updation of rows
        // for (int i = 0; i < m; i++) {
        // if (rows[i] == true) {
        // for (int j = 0; j < n; j++) {
        // arr[i][j] = 1;
        // }
        // }
        // }
        // // updation of columns
        // for (int i = 0; i < n; i++) {
        // if (columns[i] == true) {
        // for (int j = 0; j < m; j++) {
        // arr[j][i] = 1;
        // }
        // }
        // }

        // SOLUTION 2 - INSTEAD OF CREATING SEPARATE ARRAYS WE WILL USE 1ST ROW AND 1ST
        // COLUMN OF GIVEN ARRAY TO TRACT THE INFO.

        boolean rowfirst = false;
        boolean colfirst = false;
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 1) {
                rowfirst = true;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[0][i] == 1) {
                colfirst = true;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 1) {
                    arr[0][j] = 1;// column
                    arr[i][0] = 1;// row
                }
            }
        }

        // updation of rows
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 1) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = 1;
                }
            }
        }
        // updation of columns
        for (int i = 1; i < n; i++) {
            if (arr[0][i] == 1) {
                for (int j = 0; j < m; j++) {
                    arr[j][i] = 1;
                }
            }
        }

        if (rowfirst) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 1;
            }
        }
        if (colfirst) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
