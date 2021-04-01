package 算法题;
/**
 * 322. 零钱兑换
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 * 你可以认为每种硬币的数量是无限的。
 * 示例 1：
 * 输入：coins = [1, 2, 5], amount = 11
 * 输出：3
 * 解释：11 = 5 + 5 + 1
 * 示例 2：
 * 输入：coins = [2], amount = 3
 * 输出：-1
 * 示例 3：
 * 输入：coins = [1], amount = 0
 * 输出：0
 * 示例 4：
 * 输入：coins = [1], amount = 1
 * 输出：1
 * 示例 5：
 * 输入：coins = [1], amount = 2
 * 输出：2
 * 提示：
 * 1 <= coins.length <= 12
 * 1 <= coins[i] <= 231 - 1
 * 0 <= amount <= 104
 */
public class likou322 {
    public static void main(String[] args) {
        likou322 likou322 = new likou322();
        int[] coins={1,2,5};
        memo=new int[100];
        for (int i = 0; i < memo.length; i++) {
            memo[i]=0;
        }
        int i = likou322.coinChange2(coins, 11);
        System.out.println(i);

    }
    static int[] memo;
    //自顶向下
    public int coinChange(int[] coins, int amount) {
        if (amount==0)return 0;
        if (amount<0)return -1;
        if (memo[amount]!=0)return memo[amount];
        int res=Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int subproblem=coinChange(coins, amount-coins[i]);
            if (subproblem==-1) continue;
            res=Math.min(res,1+subproblem);
        }
        if (res==Integer.MAX_VALUE) return -1;
        memo[amount]=res;
        return memo[amount];
    }
    //自底向上
    public int coinChange2(int[] coins,int amount){
        memo=new int[amount+1];
        for (int i = 0; i < memo.length; i++) {
            memo[i]=amount+1;
        }
        memo[0]=0;
        for (int i = 0; i < memo.length; i++) {
            for (int coin : coins) {
                if (i-coin<0)continue;
                memo[i]=Math.min(memo[i],1+memo[i-coin]);
            }
        }
        return (memo[amount]==amount+1)?-1:memo[amount];
    }
}
