package 算法题;
/**
 * 309. 最佳买卖股票时机含冷冻期
 * 给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 * 示例:
 * 输入: [1,2,3,0,2]
 * 输出: 3
 * 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
 */
public class likou309 {
    public static void main(String[] args) {
        likou309 likou309 = new likou309();
        int[] prices={1,2,3,0,2};
        System.out.println(likou309.maxProfit2(prices));
    }

    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp_i_0=0,dp_i_1=Integer.MIN_VALUE;
        int dp_pre_0=0;
        for (int i = 0; i < n; i++) {
            int temp=dp_i_0;
            dp_i_0=Math.max(dp_i_0,dp_i_1+prices[i]);
            dp_i_1=Math.max(dp_i_1,dp_pre_0-prices[i]);
            dp_pre_0=temp;
        }
        return dp_i_0;
    }

    public int maxProfit2(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for (int i = 0; i < n; i++) {
            if (i==0){
                dp[i][0]=0;
                dp[i][1]=-prices[0];
                continue;
            }
            int dp_back_2=0;
            if (i-2>=0) dp_back_2=dp[i-2][0];
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp_back_2-prices[i]);
        }
        return dp[n-1][0];
    }
}
