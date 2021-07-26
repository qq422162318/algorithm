package 算法题;

/**
 * 343. 整数拆分
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 * 示例 1:
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1。
 * 示例 2:
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
 * 说明: 你可以假设 n 不小于 2 且不大于 58。
 */
public class likou343 {
    public static void main(String[] args) {
        likou343 likou343 = new likou343();
        System.out.println(likou343.integerBreak(10));
    }

    /**
     * dp
     *
     * @param n
     * @return
     */
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
            }
        }
        return dp[n];
    }

    /**
     * 贪心
     *
     * @param n
     * @return
     */
    public int integerBreak２(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int i = 1;
        while (n > 4) {
            n = n - 3;
            i = i * 3;
        }
        return i * n;
    }
}
