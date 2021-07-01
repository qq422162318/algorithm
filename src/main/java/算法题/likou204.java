package 算法题;

import java.util.Arrays;

/**
 * 204. 计数质数
 * 统计所有小于非负整数 n 的质数的数量。
 * 示例 1：
 * 输入：n = 10
 * 输出：4
 * 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * 示例 2：
 * 输入：n = 0
 * 输出：0
 * 示例 3：
 * 输入：n = 1
 * 输出：0
 */
public class likou204 {
    public static void main(String[] args) {
        likou204 likou = new likou204();
        System.out.println(likou.countPrimes2(3));
    }

    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] isPrim = new boolean[n + 1];
        Arrays.fill(isPrim, true);
        for (int i = 2; i * i <= n; i++) {
            if (isPrim[i])
                for (int j = i * i; j <= n; j += i)
                    isPrim[j] = false;
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrim[i]) count++;
        }
        return count;
    }

    public int countPrimes2(int n) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, true);
        for (int i = 2; i * i < n; i++)
            if (isPrim[i])
                for (int j = i * i; j < n; j += i)
                    isPrim[j] = false;

        int count = 0;
        for (int i = 2; i < n; i++)
            if (isPrim[i]) count++;

        return count;
    }
}
