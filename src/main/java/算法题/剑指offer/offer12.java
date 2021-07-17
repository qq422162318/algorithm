package 算法题.剑指offer;

/**
 * 剑指 Offer 12. 矩阵中的路径
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 * 例如，在下面的 3×4 的矩阵中包含单词 "ABCCED"（单词中的字母已标出）。
 * 示例 1：
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 * 示例 2：
 * 输入：board = [["a","b"],["c","d"]], word = "abcd"
 * 输出：false
 * 提示：
 * 1 <= board.length <= 200
 * 1 <= board[i].length <= 200
 * board 和 word 仅由大小写英文字母组成
 */
public class offer12 {
    String wor;
    char[][] boar;
    boolean[][] visit;

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        wor = word;
        boar = board;
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int index) {
        if (index == wor.length() - 1) {
            return boar[i][j] == wor.charAt(index);
        }
        int[][] tt = {
                {0, -1},
                {-1, 0},
                {0, 1},
                {1, 0}
        };
        if (boar[i][j] == wor.charAt(index)) {
            visit[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int newX = i + tt[k][0];
                int newY = j + tt[k][1];
                if (inArea(newX, newY) && !visit[newX][newY]) {
                    if (dfs(newX, newY, index + 1)) return true;
                }
            }
            visit[i][j] = false;
        }
        return false;
    }

    private boolean inArea(int i, int j) {
        return i >= 0 && j >= 0 & i < boar.length && j < boar[0].length;
    }
}
