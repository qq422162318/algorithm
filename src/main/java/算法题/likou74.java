package 算法题;
/**
 * 74. 搜索二维矩阵
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * 示例 1:
 * 输入:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 3
 * 输出: true
 * 示例 2:
 * 输入:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 13
 * 输出: false
 */
public class likou74 {
    public static void main(String[] args) {
      int[][] matrix = {
              {1,   3,  5,  7},
              {10, 11, 16, 20},
              {23, 30, 34, 50}
       };
       int target = 3;

        boolean b = searchMatrix(matrix, target);
        System.out.println(b);
    }
    public static boolean searchMatrix(int[][] matrix,int target){
        int m=matrix.length;
        if(m==0)return false;
        int n=matrix[0].length;
        int left=0,right=m*n-1;
        int pivotIdex,pivotElement;
        while(left<=right){
            pivotIdex=(left+right)/2;
            pivotElement=matrix[pivotIdex/n][pivotIdex%n];
            if (target==pivotElement)
                return true;
            else{
                if (target<pivotElement)
                    right=pivotIdex-1;
                else
                    left=pivotIdex+1;
            }
        }
        return false;
    }
}
