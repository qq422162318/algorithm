package 算法题;

import java.util.Arrays;

/**
 * 64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 * 示例:
 * 输入:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 */
public class likou64 {
    public static void main(String[] args) {
        int[][] nums = {{1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}};
        likou64 likou64 = new likou64();
        int i = likou64.minPathSum2(nums);
        System.out.println(i);
    }

    public int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }

    int[][] memo;
    public int minPathSum2(int[][] grid) {
        if (grid.length == 0) return 0;
        int m = grid.length, n = grid[0].length;
        memo = new int[m][n];
        for (int[] ints : memo)
            Arrays.fill(ints, -1);
        return dp(grid, m - 1, n - 1);
    }
    private int dp(int[][] grid, int i, int j) {
        if (i == 0 && j == 0) return grid[0][0];
        if (i < 0 || j < 0) return Integer.MAX_VALUE;
        if (memo[i][j] != -1) return memo[i][j];
        memo[i][j] = Math.min(dp(grid, i-1, j),dp(grid, i, j-1))+grid[i][j];
        return memo[i][j];
    }
}
