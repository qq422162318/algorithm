package 算法题;
/**
 * 123. 买卖股票的最佳时机 III
 * 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 示例 1:
 * 输入：prices = [3,3,5,0,0,3,1,4]
 * 输出：6
 * 解释：在第 4 天（股票价格 = 0）的时候买入，在第 6 天（股票价格 = 3）的时候卖出，这笔交易所能获得利润 = 3-0 = 3 。
 *      随后，在第 7 天（股票价格 = 1）的时候买入，在第 8 天 （股票价格 = 4）的时候卖出，这笔交易所能获得利润 = 4-1 = 3 。
 * 示例 2：
 * 输入：prices = [1,2,3,4,5]
 * 输出：4
 * 解释：在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
 *      因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 * 示例 3：
 * 输入：prices = [7,6,4,3,1]
 * 输出：0
 * 解释：在这个情况下, 没有交易完成, 所以最大利润为 0。
 * 示例 4：
 * 输入：prices = [1]
 * 输出：0
 */
public class likou123 {
    public static void main(String[] args) {
       int[] nums={3,3,5,0,0,3,1,4};
        likou123 likou123 = new likou123();
        System.out.println(likou123.maxProfit(nums));
    }
    public int maxProfit(int[] prices) {
        int a=0,b=Integer.MIN_VALUE;
        int c=0,d=Integer.MIN_VALUE;
        for (int price : prices) {
            a=Math.max(a,b+price);
            b=Math.max(b,c-price);
            c=Math.max(c,d+price);
            d=Math.max(d,-price);
        }
        return a;
    }
    public int maxProfit2(int[] prices) {
        int dpi20=0,dpi21=Integer.MIN_VALUE;
        int dpi10=0,dpi11=Integer.MIN_VALUE;
        for (int price : prices) {
            dpi20=Math.max(dpi20,dpi21+price);
            dpi21=Math.max(dpi21,dpi10-price);
            dpi10=Math.max(dpi10,dpi11+price);
            dpi11=Math.max(dpi11,-price);
        }
        return dpi20;
    }
}
