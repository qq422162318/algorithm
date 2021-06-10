package 算法题;

/**
 * 877. 石子游戏
 * 亚历克斯和李用几堆石子在做游戏。偶数堆石子排成一行，每堆都有正整数颗石子 piles[i] 。
 * 游戏以谁手中的石子最多来决出胜负。石子的总数是奇数，所以没有平局。
 * 亚历克斯和李轮流进行，亚历克斯先开始。 每回合，玩家从行的开始或结束处取走整堆石头。
 * 这种情况一直持续到没有更多的石子堆为止，此时手中石子最多的玩家获胜。
 * 假设亚历克斯和李都发挥出最佳水平，当亚历克斯赢得比赛时返回 true ，当李赢得比赛时返回 false 。
 * 示例：
 * 输入：[5,3,4,5]
 * 输出：true
 * 解释：
 * 亚历克斯先开始，只能拿前 5 颗或后 5 颗石子 。
 * 假设他取了前 5 颗，这一行就变成了 [3,4,5] 。
 * 如果李拿走前 3 颗，那么剩下的是 [4,5]，亚历克斯拿走后 5 颗赢得 10 分。
 * 如果李拿走后 5 颗，那么剩下的是 [3,4]，亚历克斯拿走后 4 颗赢得 9 分。
 * 这表明，取前 5 颗石子对亚历克斯来说是一个胜利的举动，所以我们返回 true 。
 */
public class likou877 {
    /**
     * dp[i][j][0] 对于 piles[i...j] 这部分石头堆，先手能获得的最高分数
     * dp[i][j][1] 对于 piles[i...j] 这部分石头堆，后手能获得的最高分数
     * @param piles
     * @return
     */
    public boolean stoneGame(int[] piles) {
        if (piles.length == 0) return false;
        int n = piles.length;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=piles[i];
        }
        int[][][] dp = new int[n][n][2];
        for (int i = 0; i < n; i++) {
            dp[i][i][0] = piles[i];
            dp[i][i][1] = 0;
        }
        for (int tmp = 1; tmp < n; tmp++) {
            for (int i = 0; i < n-tmp; i++) {
                int j=i+tmp;

                    int left=piles[i]+dp[i+1][j][1];
                    int right=piles[j]+dp[i][j-1][1];
                    if (left>right){
                        dp[i][j][0]=left;
                        dp[i][j][1]=dp[i+1][j][0];
                    }else{
                        dp[i][j][0]=right;
                        dp[i][j][1]=dp[i][j-1][0];
                    }

            }
        }
        int res=dp[0][n-1][0];
        return res>sum-res;
    }
}
