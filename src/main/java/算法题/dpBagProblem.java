package 算法题;

import java.util.Arrays;

/**
 * 经典动态规划之背包问题
 */
public class dpBagProblem {
    public static void main(String[] args) {
        int[] wt = {2, 1, 3};
        int[] val={4,2,3};
        dpBagProblem dpBagProblem = new dpBagProblem();
        System.out.println(dpBagProblem.bag(wt, val, 4));
    }
    /**
     * dp[i][w]的定义如下：对于前i个物品，当前背包的容量为w，这种情况下可以装的最大价值是dp[i][w]。
     */
    public int bag(int[] wt,int[] val,int weight){
        if (wt.length==0||weight==0)return 0;
        int n=wt.length;
        int[][] dp=new int[n+1][weight+1];
        for (int i = 0; i <= n; i++) dp[i][0]=0;
        for (int i = 0; i <= weight; i++) dp[0][i]=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= weight; j++) {
               if (j-wt[i-1]>=0)
                   dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-wt[i-1]]+val[i-1]);
               else
                   dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][weight];
    }
}
