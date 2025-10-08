package BackTracking.intermediate;

import java.util.Scanner;

public class Rat_Chases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        int[][] ans = new int[n][m];

        for (int i = 0; i < maze.length; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }

        print(maze, 0, 0, ans);
        if (val == false) {
            System.out.println("NO PATH FOUND");
        }
    }

    static boolean val = false;

    public static void print(char[][] maze, int cr, int cc, int[][] ans) {
        if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
            return;
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;

        if (cr == maze.length - 1 && cc == maze[0].length - 1) {
            display(ans);
            val = true;
            return;
        }

        // print(maze, cr - 1, cc, ans);// up
        // print(maze, cr, cc - 1, ans);// left
        // print(maze, cr + 1, cc, ans);// down
        // print(maze, cr, cc + 1, ans);// right

        // using loop

        int[] r = { -1, 0, 1, 0 };
        int[] c = { 0, -1, 0, 1 };
        for (int i = 0; i < c.length; i++) {
            print(maze, cr + r[i], cc + c[i], ans);
        }
        maze[cr][cc] = '0';
        ans[cr][cc] = 0;
    }

    public static void display(int ans[][]) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
