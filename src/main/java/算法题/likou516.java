package 算法题;

import java.util.Arrays;

/**
 * 516. 最长回文子序列
 * 给定一个字符串 s ，找到其中最长的回文子序列，并返回该序列的长度。可以假设 s 的最大长度为 1000 。
 * 示例 1:
 * 输入:
 * "bbbab"
 * 输出:
 * 4
 * 一个可能的最长回文子序列为 "bbbb"。
 * 示例 2:
 * 输入:
 * "cbbd"
 * 输出:
 * 2
 * 一个可能的最长回文子序列为 "bb"。
 * 提示：
 * 1 <= s.length <= 1000
 * s 只包含小写英文字母
 */
public class likou516 {
    public static void main(String[] args) {
        likou516 likou516 = new likou516();
        System.out.println(likou516.longestPalindromeSubseq2("bbbab"));
    }

    /**
     * dp 数组的定义是：在子串s[i..j]中，最长回文子序列的长度为dp[i][j]
     *
     * @param s
     * @return
     */
    public int longestPalindromeSubseq(String s) {
        if (s.length() == 0) return 0;
        int m = s.length();
        int[][] dp = new int[m][m];
        for (int i = 0; i < m; i++)
            dp[i][i] = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = i + 1; j < m; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][m - 1];
    }

    public int longestPalindromeSubseq2(String s) {
        if (s.length() == 0) return 0;
        int m = s.length();
        int[] dp = new int[m];
        Arrays.fill(dp,1);
        for (int i = m - 2; i >= 0; i--) {
            int lastMax = 0;
            for (int j = i + 1; j < m; j++) {
                int temp = dp[j];
                if (s.charAt(i) == s.charAt(j))
                    dp[j] = lastMax + 2;
                else
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                lastMax = temp;
            }
        }
        return dp[m - 1];
    }
}
