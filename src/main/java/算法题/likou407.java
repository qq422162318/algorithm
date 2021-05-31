package 算法题;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 407. 接雨水 II
 * 给你一个 m x n 的矩阵，其中的值均为非负整数，代表二维高度图每个单元的高度，请计算图中形状最多能接多少体积的雨水。
 * 示例：
 * 给出如下 3x6 的高度图:
 * [
 * [1,4,3,1,3,2],
 * [3,2,1,3,2,4],
 * [2,3,3,2,3,1]
 * ]
 * 返回 4 。
 */
public class likou407 {
    int m, n;

    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap[0].length == 0) return 0;
        int m = heightMap.length, n = heightMap[0].length;
        this.m = m;
        this.n = n;
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[2] - o2[2]);
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    pq.offer(new int[]{i, j, heightMap[i][j]});
                    visited[i][j] = true;
                }
            }
        }
        int res = 0;
        int[] pos = new int[]{0, -1, 0, 1, 0};
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            for (int i = 0; i < 4; i++) {
                int newX = top[0] + pos[i], newY = top[1] + pos[i + 1];
                if (!visited[newX][newY] && inRange(newX, newY)) {
                    if (heightMap[newX][newY] > top[2]) {
                        res += heightMap[newX][newY];
                        visited[newX][newY]=true;
                    }
                    pq.offer(new int[]{newX, newY, Math.max(heightMap[newX][newY], top[2])});
                }
            }
        }
        return res;
    }

    private boolean inRange(int newX, int newY) {
        return newX >= 0 && newY >= 0 && newX < m && newY < n;
    }
}
