package 算法题;

import java.util.Arrays;

/**
 * 931. 下降路径最小和
 * 给你一个 n x n 的 方形 整数数组 matrix ，请你找出并返回通过 matrix 的下降路径 的 最小和 。
 * 下降路径 可以从第一行中的任何元素开始，并从每一行中选择一个元素。在下一行选择的元素和当前行所选元素最多相隔一列（即位于正下方或者沿对角线向左或者向右的第一个元素）。具体来说，位置 (row, col) 的下一个元素应当是 (row + 1, col - 1)、(row + 1, col) 或者 (row + 1, col + 1) 。
 * 示例 1：
 * 输入：matrix = [[2,1,3],[6,5,4],[7,8,9]]
 * 输出：13
 * 解释：下面是两条和最小的下降路径，用加粗标注：
 * [[2,1,3],      [[2,1,3],
 * [6,5,4],       [6,5,4],
 * [7,8,9]]       [7,8,9]]
 * 示例 2：
 * 输入：matrix = [[-19,57],[-40,-5]]
 * 输出：-59
 * 解释：下面是一条和最小的下降路径，用加粗标注：
 * [[-19,57],
 * [-40,-5]]
 * 示例 3：
 * 输入：matrix = [[-48]]
 * 输出：-48
 * 提示：
 * n == matrix.length
 * n == matrix[i].length
 * 1 <= n <= 100
 * -100 <= matrix[i][j] <= 100
 */
public class likou931 {
    public static void main(String[] args) {
        int[][] dd = new int[][]{
                {2, 1, 3}, {6, 5, 4}, {7, 8, 9}
        };
        System.out.println(new likou931().minFallingPathSum(dd));
    }

    public int minFallingPathSum(int[][] matrix) {
        if (matrix.length == 0) return 0;
        int n = matrix.length;
        int res = Integer.MAX_VALUE;
        memo = new int[n][matrix[0].length];
        for (int i = 0; i < n; i++)
            Arrays.fill(memo[i], 66666);
        for (int i = 0; i < n; i++) {
            res = Integer.min(res, dp(matrix, n - 1, i));
        }
        return res;
    }

    int[][] memo;

    int dp(int[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix.length) return 99999;
        if (i == 0) return matrix[i][j];
        if (memo[i][j] != 66666) return memo[i][j];
        memo[i][j] = matrix[i][j] +
                Integer.min(dp(matrix, i - 1, j),
                        Math.min(dp(matrix, i - 1, j - 1), dp(matrix, i - 1, j + 1)));
        return memo[i][j];
    }
}
