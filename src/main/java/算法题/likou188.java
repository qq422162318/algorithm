package 算法题;

import java.util.Optional;

/**
 * 188. 买卖股票的最佳时机 IV
 * 给定一个整数数组 prices ，它的第 i 个元素 prices[i] 是一支给定的股票在第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 示例 1：
 * 输入：k = 2, prices = [2,4,1]
 * 输出：2
 * 解释：在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
 * 示例 2：
 * 输入：k = 2, prices = [3,2,6,5,0,3]
 * 输出：7
 * 解释：在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4 。
 *      随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3 。
 * 提示：
 * 0 <= k <= 100
 * 0 <= prices.length <= 1000
 * 0 <= prices[i] <= 1000
 */
public class likou188 {
    public static void main(String[] args) {
        likou188 likou188 = new likou188();
        int[] prices={3,2,6,5,0,3};
        System.out.println(likou188.maxProfit(2, prices));
    }

    public int maxProfit(int max_k, int[] prices) {
        int n=prices.length;
        if (max_k>n/2)return maxProfit(prices);
        int[][][] dp=new int[n][max_k+1][2];
        for (int i = 0; i < prices.length; i++) {
            for (int k = max_k; k >=1 ; k--) {
                if (i-1==-1){
                  dp[i][k][0]=0;
                  dp[i][k][1]=-prices[i];
                  continue;
                }
                dp[i][k][0]=Math.max(dp[i-1][k][0],dp[i-1][k][1]+prices[i]);
                dp[i][k][1]=Math.max(dp[i-1][k][1],dp[i-1][k-1][0]-prices[i]);
            }
        }
        return dp[n-1][max_k][0];
    }

    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp_0=0,dp_1=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int temp=dp_0;
            dp_0=Math.max(dp_0,dp_1+prices[i]);//dp0存放利润
            dp_1=Math.max(dp_1,temp-prices[i]);//用dp1存放买股票之后的钱如果小于就不买
        }
        return dp_0;
    }
}
