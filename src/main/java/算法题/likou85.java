package 算法题;

import java.util.Stack;

/**
 * 85. 最大矩形
 * 给定一个仅包含 0 和 1 、大小为 rows x cols 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。
 * 示例 1：
 * 输入：matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
 * 输出：6
 * 解释：最大矩形如上图所示。
 * 示例 2：
 * 输入：matrix = []
 * 输出：0
 * 示例 3：
 * 输入：matrix = [["0"]]
 * 输出：0
 * 示例 4：
 * 输入：matrix = [["1"]]
 * 输出：1
 * 示例 5：
 * 输入：matrix = [["0","0"]]
 * 输出：0
 * 提示：
 * rows == matrix.length
 * cols == matrix[0].length
 * 0 <= row, cols <= 200
 * matrix[i][j] 为 '0' 或 '1'
 */
public class likou85 {
    public static void main(String[] args) {
        likou85 likou85 = new likou85();
        char[][] m = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        System.out.println(likou85.maximalRectangle(m));
    }

    public int maximalRectangle(char[][] matrix) {
        int[] tmp = new int[matrix.length];
        int index = 0;
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        for (char[] chars : matrix) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '1' && max == 0) {
                    max++;
                    continue;
                }
                if (i >= 1 && chars[i] == '1' && chars[i - 1] == '1') {
                    max++;
                }
            }
            tmp[index++] = max;
            max=0;
        }
        int[] ints = new int[tmp.length + 2];
        System.arraycopy(tmp, 0, ints, 1, tmp.length);
        tmp = ints;
        for (int i = 0; i < tmp.length; i++) {
            while (!stack.isEmpty() && tmp[i] < tmp[stack.peek()]) {
                int h = tmp[stack.pop()];
                max = Math.max(max, (i - stack.peek() - 1) * h);
            }
            stack.push(i);
        }
        return max;
    }
}
