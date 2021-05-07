package 数据结构.动态规划;

/**
 * 例2：有一个矩阵map，它每个格子有一个权值。
 * 从左上角的格子开始每次只能向右或者向下走，最后到达右下角的位置，
 *  路径上所有的数字累加起来就是路径和，返回所有的路径中最小的路径和。
 */
public class MinPath {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt();
//        int n=sc.nextInt();
        int m=4;
        int n=4;
        int map[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map[i][j]=1;//sc.nextInt();
            }
        }
        System.out.println(getMin(map,m,n));

    }
    public static int getMin(int[][] map,int n,int m){
        int[][] dp=new int[n][m];
        for (int i = 0; i <n ; i++) {//初始化第一列的值
            for (int j = 0; j <i ; j++) {
                dp[i][0]+=map[j][0];
            }
        }
        for (int i = 0; i <m ; i++) {//初始化第一行的值
            for (int j = 0; j <i ; j++) {
                dp[0][i]+=map[0][j];
            }
        }
        for (int i=1;i<n;i++){
            for (int j = 1; j <m ; j++) {
                dp[i][j]=min(dp[i][j-1]+map[i][j],dp[i-1][j]+map[i][j]);
            }
        }
        return dp[n-1][m-1];
    }
    public static int min(int a,int b){
        if (a>b){
            return b;
        }else{
            return a;
        }
    }
}
