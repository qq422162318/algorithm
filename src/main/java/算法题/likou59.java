package 算法题;

/**
 * 59. 螺旋矩阵 II
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * 示例:
 * 输入: 3
 * 输出:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 */
public class likou59 {
    public static void main(String[] args) {
        likou59 likou59 = new likou59();
        int[][] generatematrix = likou59.generatematrix(3);
        for (int i = 0; i <generatematrix.length ; i++) {
            for (int j = 0; j <generatematrix[0].length ; j++) {
                System.out.print(generatematrix[i][j]);
            }
            System.out.println();
        }
    }
    public int[][] generatematrix(int n){
     if (n==0){
         return null;
     }
     int left=0,right=n-1,top=0,bottom=n-1;
     int[][] temp=new int[n][n];
     int num=1,tar=n*n;
     while(num<=tar){
         for (int i=left;i<=right;i++)
             temp[top][i]=num++;
         top++;
         for (int i=top;i<=bottom;i++)
             temp[i][right]=num++;
         right--;
         for (int i=right;i>=left;i--)
             temp[bottom][i]=num++;
         bottom--;
         for (int i=bottom;i>=top;i--)
             temp[i][left]=num++;
         left++;
     }
        return temp;//integers.toArray(new int[n][n]);
    }

}
