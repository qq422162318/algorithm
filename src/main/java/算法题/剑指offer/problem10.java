package com.my;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：n = 5
 * 输出：5
 */
public class problem10 {
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
