package com.example.ip2021.questions.array;

/**
 * https://leetcode.com/problems/unique-paths-ii/
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 *
 * An obstacle and space is marked as 1 and 0 respectively in the grid.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
 * Output: 2
 * Explanation: There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right
 * Example 2:
 *
 *
 * Input: obstacleGrid = [[0,1],[0,0]]
 * Output: 1
 *
 */
public class UniquePath_2 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;

        int first = -1;
        int dp[][] = new int[rows][cols];
        for (int i = 0; i < rows ; i++) {
            dp[i][0] = 1;
            if (obstacleGrid[i][0] == 1) {
                dp[i][0] = 0;
                first = i;
            }

            if (first != -1) {
                dp[i][0] = 0;
            }
        }

        first = -1;

        for (int i = 0; i < cols; i++) {
            dp[0][i] = 1;
            if (obstacleGrid[0][i] == 1) {
                dp[0][i] = 0;
                first = i;
            }

            if (first != -1) {
                dp[0][i] = 0;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (obstacleGrid[i][j] == 1 ) {
                    dp[i][j]  = 0;
                } else {
                    int topCount = obstacleGrid[i-1][j] == 1 ? 0 : dp[i-1][j];
                    int leftCount = obstacleGrid[i][j-1] == 1 ? 0 : dp[i][j-1];
                    dp[i][j] = topCount + leftCount;
                }

            }
        }

        return  dp[rows-1][cols-1];

    }
}
