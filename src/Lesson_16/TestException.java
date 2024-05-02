package Lesson_16;

import java.io.FileNotFoundException;

public class TestException {
    public static void main(String[] args) throws FileNotFoundException {


        int[][] grid = new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};


        int i = minPathSum(grid);
        System.out.println(i);
    }

    public static int minPathSum(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] dp = new int[r][c];
        for (int i = r - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {
                if (i == r - 1 && j != c - 1) {
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
                } else if (j == c - 1 && i != r - 1) {
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                } else if (i != r - 1 && j != c - 1) {
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                } else {
                    dp[i][j] = grid[i][j];
                }
            }
        }
        return dp[0][0];
    }

}
