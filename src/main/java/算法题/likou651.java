package 算法题;

import java.util.Arrays;

/**
 * 651. 四键键盘
 * 假设你有一个特殊的键盘包含下面的按键
 * key 1：（A）：在屏幕上打印一个‘A’
 * key 2：（Ctrl-A）：选中整个屏幕
 * key 3：（Ctrl-C）：复制选中区域到缓冲区
 * key 4：（Ctrl-V）：将缓冲区内容输出到赏赐输入的结束位置，并显示在屏幕上
 * 现在，你之可以按键N次（使用上述四种按键），请问屏幕上最多可以显示几个A呢
 * 示例：
 * 输入：N=3
 * 输出：3
 * 解释：
 * 我们最到可以在屏幕上显示三个A通过如下顺序按键：
 * A，A，A
 * 样例2：
 * 输入：N=7
 * 输出：9
 * 解释：
 * 我们最到可以在屏幕上显示九个A通过如下顺序按键：
 * A，A，A，Ctrl A，Ctrl C，Ctrl V，Ctrl V
 */
public class likou651 {
    public static void main(String[] args) {
        likou651 likou = new likou651();
        System.out.println(likou.maxA2(7));
    }
    int[][][] memo;
    public int maxA(int N) {
        if (N==0) return 0;
        for (int[][] ints : memo) {
            for (int[] anInt : ints)
                Arrays.fill(anInt,-1);
        }
        return dp(N,0,0);
    }
    private int dp(int n, int a_num, int copy) {
        if (n<=0) return a_num;
        if (memo[n][a_num][copy]!=-1) return memo[n][a_num][copy];
        memo[n][a_num][copy] = max(
                dp(n-1, a_num+1, copy),
                dp(n-1, a_num+copy, copy),
                dp(n-2, a_num, a_num)
        );
        return memo[n][a_num][copy];
    }
    private int max(int dp, int dp1, int dp2) {
        return Math.max(dp,Math.max(dp1,dp2));
    }

    /**
     *
     * @param N
     * @return
     */
    public int maxA2(int N) {
        if (N==0) return 0;
        int[] dp=new int[N+1];
        for (int i = 1; i <= N; i++) {
            // 按 A 键
            dp[i]=dp[i-1]+1;
            for (int j = 2; j < i; j++) {
                // 全选 & 复制 dp[j-2]，连续粘贴 i - j 次
                // 屏幕上共 dp[j - 2] * (i - j + 1) 个 A
                dp[i]=Math.max(dp[i],dp[j-2]*(i-j+1));
            }
        }
        return dp[N];
    }
}
