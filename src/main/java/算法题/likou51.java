package 算法题;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 51. N皇后
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * 上图为 8 皇后问题的一种解法。
 * 给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。
 * 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 * 示例:
 * 输入: 4
 * 输出: [
 * [".Q..",  // 解法 1
 * "...Q",
 * "Q...",
 * "..Q."],
 * <p>
 * ["..Q.",  // 解法 2
 * "Q...",
 * "...Q",
 * ".Q.."]
 * ]
 * 解释: 4 皇后问题存在两个不同的解法。
 * 提示：
 * 皇后，是国际象棋中的棋子，意味着国王的妻子。皇后只做一件事，那就是“吃子”。当她遇见可以吃的棋子时，就迅速冲上去吃掉棋子。当然，她横、竖、斜都可走一到七步，可进可退。（引用自 百度百科 - 皇后 ）
 */
public class likou51 {
    public static void main(String[] args) {
        likou51 likou51 = new likou51();
        List<List<String>> lists = likou51.solveNQueens(4);
        System.out.println(lists.size());
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.println(s);
            }
            System.out.println("===========");
        }
    }

    boolean[] col = null;
    boolean[] left = null;
    boolean[] right = null;
    List<List<String>> ret = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        col = new boolean[n];
        left = new boolean[2 * n - 1];
        right = new boolean[2 * n - 1];
        char[][] board = new char[n][n];
        backTrack(board, 0, n);
        return ret;
    }

    public void backTrack(char[][] board, int r, int n) {
        if (r >= n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(new String(board[i]));
            }
            ret.add(list);
            return;
        }
        Arrays.fill(board[r], '.');
        for (int i = 0; i < n; i++) {
            if (!col[i] && !left[r + i] && !right[r - i + n - 1]) {
                board[r][i] = 'Q';
                col[i] = true;
                left[r + i] = true;
                right[r - i + n - 1] = true;
                backTrack(board, r + 1, n);
                board[r][i] = '.';
                col[i] = false;
                left[r + i] = false;
                right[r - i + n - 1] = false;

            }
        }
    }

    public List<List<String>> solveNQueens2(int n) {
        char[][] board = new char[n][n];
        for (char[] chars : board) {
            Arrays.fill(chars, '.');
        }
        backtrack(board, 0);
        return res;
    }

    List<List<String>> res = new ArrayList<>();

    //经过修改只找一种解法
    public boolean backtrack(char[][] board, int row) {
        if (row == board.length) {
            res.add(arrayList(board));
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if (!check(board, row, i)) {
                continue;
            }
            board[row][i] = 'Q';
            if (backtrack(board, row + 1))
                return true;
            board[row][i] = '.';
        }
        return false;
    }

    private boolean check(char[][] board, int row, int col) {
        int n = board.length;
        //检测每一行的指定列
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }
        //检测右上board[row-1][col+1]
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        //检测左上board[row-1][col-1]
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    private List<String> arrayList(char[][] board) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (char[] chars : board) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char aChar : chars) {
                stringBuilder.append(aChar);
            }
            linkedList.add(stringBuilder.toString());
        }
        return linkedList;
    }
}
