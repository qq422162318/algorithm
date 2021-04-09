package 算法题;

/**
 * 130. 被围绕的区域
 * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
 * 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 * 示例:
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * 运行你的函数后，矩阵变为：
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * 解释:
 * 被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
 */
public class likou130 {
    public static void main(String[] args) {
        likou130 likou130 = new likou130();
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        likou130.solve(board);
        int rr = board.length;
        int cc = board[0].length;
        for (int i = 0; i < rr; i++) {
            for (int i1 = 0; i1 < cc; i1++) {
                System.out.print(board[i][i1] + "\t");
            }
            System.out.println();
        }
    }

    int row;
    int col;

    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;
        row = board.length;
        col = board[0].length;
        //对所有行第一列，最后一列遍历O并替换为-
        for (int i = 0; i < row; i++) {
            dfs(board, i, 0);
            dfs(board, i, col-1);
        }
        //对第一行，最后一行遍历O并替换为-
        for (int i = 0; i < col; i++) {
            dfs(board, 0, i);
            dfs(board, row - 1, i);
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j]=='O')board[i][j]='X';
                if (board[i][j]=='-')board[i][j]='O';
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || board[i][j] != 'O') return;
        board[i][j] = '-';
        dfs(board, i - 1, j);
        dfs(board, i + 1, j);
        dfs(board, i, j - 1);
        dfs(board, i, j + 1);
        return;
    }

    public void solve2(char[][] board) {
        if (board.length == 0) return;
        int m = board.length, n = board[0].length;
        UF uf = new UF(m * n + 1);
        int dummy = m * n;
        // 将首列和末列的 O 与 dummy 连通
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') uf.union(i * n, dummy);
            if (board[i][n - 1] == 'O') uf.union(i * n + n - 1, dummy);
        }
        // 将首行和末行的 O 与 dummy 连通
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') uf.union(j, dummy);
            if (board[m - 1][j] == 'O') uf.union(n * (m - 1) + j, dummy);
        }
        // 方向数组 d 是上下左右搜索的常用手法
        int[][] d = new int[][]{{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (board[i][j] == 'O') {
                    // 将此 O 与上下左右的 O 连通
                    for (int k = 0; k < 4; k++) {
                        int x = i + d[k][0];
                        int y = j + d[k][1];
                        if (board[x][y] == 'O') {
                            uf.union(x * n + y, i * n + j);
                        }
                    }
                }
            }
        }
        // 所有不和 dummy 连通的 O，都要被替换
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (!uf.connected(dummy, i * n + j)) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
