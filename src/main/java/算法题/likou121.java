package 算法题;

/**
 * 121. 买卖股票的最佳时机
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 * 示例 1：
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * 示例 2：
 * 输入：prices = [7,6,4,3,1]
 * 输出：0
 * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
 * 提示：
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 */
public class likou121 {
    public static void main(String[] args) {
          int[] nums={7,1,5,3,6,4};
        likou121 likou = new likou121();
        System.out.println(likou.maxProfit2(nums));
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for (int i = 0; i < n; i++) {
            if (i-1==-1){
                dp[i][0]=0;
                dp[i][1]=-prices[i];
                continue;
            }
            /**
             * 解释：今天我没有持有股票，有两种可能：
             * 要么是我昨天就没有持有，然后今天选择 rest，所以我今天还是没有持有；
             * 要么是我昨天持有股票，但是今天我 sell 了，所以我今天没有持有股票了。
             */
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            /**
             * 解释：今天我持有着股票，有两种可能：
             * 要么我昨天就持有着股票，然后今天选择 rest，所以我今天还持有着股票；
             * 要么我昨天本没有持有，但今天我选择 buy，所以今天我就持有股票了。
             */
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[n-1][0];
    }

    public int maxProfit2(int[] prices) {
        int n=prices.length;
        int dp_i_0 = 0, dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            dp_i_0=Math.max(dp_i_0,dp_i_1+prices[i]);
            dp_i_1=Math.max(dp_i_1,-prices[i]);
        }
        return dp_i_0;
    }
}
