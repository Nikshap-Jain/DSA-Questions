package Arrays.TwoDArrays;

public class stairCaseSearch {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 11;
        System.out.println(search(matrix, target));
    }

    public static boolean search(int[][] matrix, int item) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == item) {
                return true;
            } else if (matrix[row][col] > item) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
