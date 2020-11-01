package jieti;
import java.util.HashSet;
import java.util.Set;
/**
 *73. 矩阵置零
 * 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
 * 示例 1:
 * 输入:
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * 输出:
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 * 示例 2:
 * 输入:
 * [
 *   [0,1,2,0],
 *   [3,4,5,2],
 *   [1,3,1,5]
 * ]
 * 输出:
 * [
 *   [0,0,0,0],
 *   [0,4,5,0],
 *   [0,3,1,0]
 * ]
 * 进阶:
 * 一个直接的解决方案是使用  O(mn) 的额外空间，但这并不是一个好的解决方案。
 * 一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。
 * 你能想出一个常数空间的解决方案吗？
 */
public class likou73 {
    public static void main(String[] args) {
      int[][] arrs={
              {0,1,2,0},
              {3,4,5,2},
              {1,3,1,5}
            };
        int[][] arr = setZeroes(arrs);
        int m=arr.length;
        int n=arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] setZeroes(int[][] matrix){
       int m=matrix.length;
       int n=matrix[0].length;
        Set<Integer> rows=new HashSet<>();
        Set<Integer> cols=new HashSet<>();
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (rows.contains(i)||cols.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }
}
