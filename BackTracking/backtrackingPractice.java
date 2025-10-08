package BackTracking;

import java.util.*;

public class backtrackingPractice {
    public static void main(String[] args) {
        int N = 5;
        int M = 4;
        char grid[][] = { { '0', 'X', '0', '0' }, { '0', '0', '0', 'X' }, { 'X', '0', 'X', '0' },
                { 'X', '0', '0', 'X' }, { 'X', 'X', '0', '0' } };

        int ans[][] = new int[N][M];
        ans[0][0] = 1;
        int find[] = new int[1];
        print(grid, N - 1, M - 1, ans, 0, 0, find);
        if (find[0] == 0) {
            System.out.println("NO PATH FOUND");
        }
    }

    public static void print(char grid[][], int N, int M, int ans[][], int i, int j, int find[]) {
        if (i == N && j == M) {
            show(ans);
            find[0] = 1;
            return;
        }

        // right
        if (j + 1 <= M && grid[i][j + 1] != 'X' && ans[i][j + 1] == 0) {
            ans[i][j + 1] = 1;
            print(grid, N, M, ans, i, j + 1, find);
            ans[i][j + 1] = 0;
        }
        // down
        if (i + 1 <= N && grid[i + 1][j] != 'X' && ans[i + 1][j] == 0) {
            ans[i + 1][j] = 1;
            print(grid, N, M, ans, i + 1, j, find);
            ans[i + 1][j] = 0;
        }
        // left
        if (j - 1 >= 0 && grid[i][j - 1] != 'X' && ans[i][j - 1] == 0) {
            ans[i][j - 1] = 1;
            print(grid, N, M, ans, i, j - 1, find);
            ans[i][j - 1] = 0;
        }
        // up
        if (i - 1 >= 0 && grid[i - 1][j] != 'X' && ans[i - 1][j] == 0) {
            ans[i - 1][j] = 1;
            print(grid, N, M, ans, i - 1, j, find);
            ans[i - 1][j] = 0;
        }
    }

    public static void show(int ans[][]) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}