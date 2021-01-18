package 算法题;
/**
 * 63. 不同路径 II
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 * 说明：m 和 n 的值均不超过 100。
 * 示例 1:
 * 输入:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 */
public class likou63 {
    public static void main(String[] args) {
     int[][] nums={
             {0,0,0},
             {0,1,0},
             {0,0,0}
     };
        int i = uniquePathsWithObstacles(nums);
        System.out.println(i);
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid){
        if(obstacleGrid.length==0||obstacleGrid[0].length==0){
            return 0;
        }
        int m=obstacleGrid.length;int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        int start=Integer.MAX_VALUE;
        boolean flag=false;
        for (int i = 0; i <m ; i++) {
            if(obstacleGrid[i][0]==1){
                dp[i][0]=0;
                start=i;
                flag=true;
                break;
            }else{
                dp[i][0]=1;
            }
        }
        if(flag){
            for (int i = start; i <m ; i++) {
                dp[i][0]=0;
            }
            flag=false;
        }
        for (int i = 0; i <n ; i++) {
            if(obstacleGrid[0][i]==1){
                dp[0][i]=0;
                start=i;
                flag=true;
                break;
            }else{
                dp[0][i]=1;
            }
        }
        if(flag){
            for (int i=start;i<n;i++){
                dp[0][i]=0;
            }
            flag=false;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if (obstacleGrid[i][j]!=1) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return dp[m-1][n-1];
    }
}
