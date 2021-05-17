package 算法题.剑指offer;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出：2
 * 示例 2：
 * <p>
 * 输入：n = 7
 * 输出：21
 * 示例 3：
 * <p>
 * 输入：n = 0
 * 输出：1
 * 提示：
 * <p>
 * 0 <= n <= 100
 */
public class problem10_2 {
    public static void main(String[] args) {
        System.out.println(numWays(100));
    }

    public static int numWays(int n) {
        if (n <= 1) return 1;
        int[] is = new int[n + 1];
        is[0] = 1;
        is[1] = 1;
        for (int i = 2; i <= n; i++) {
            is[i] = (is[i - 1] + is[i - 2]) % 1000000007;
        }
        return is[n];
    }
}
