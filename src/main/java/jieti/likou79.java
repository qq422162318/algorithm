package jieti;
/**
 * 79. 单词搜索
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 * 示例:
 * board =
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 * 给定 word = "ABCCED", 返回 true
 * 给定 word = "SEE", 返回 true
 * 给定 word = "ABCB", 返回 false
 * 提示：
 * board 和 word 中只包含大写和小写英文字母。
 * 1 <= board.length <= 200
 * 1 <= board[i].length <= 200
 * 1 <= word.length <= 10^3
 */
public class likou79 {
    public static void main(String[] args) {
        likou79 likou79 = new likou79();
        char[][] board = {
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                            {'A', 'D', 'E', 'E'}
                };
        String word="ABCCED";
        System.out.println(likou79.exist(board, word));
    }
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (char aChar : chars) {
            for (int i = 0; i <board.length ; i++) {
                for (int j = 0; j <board[0].length ; j++) {
                    
                }
            }
        }

        return true;
    }
}
