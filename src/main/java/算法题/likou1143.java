package 算法题;

import java.util.Arrays;

/**
 * 1143. 最长公共子序列
 * 给定两个字符串 text1 和 text2，返回这两个字符串的最长 公共子序列 的长度。如果不存在 公共子序列 ，返回 0 。
 * 一个字符串的 子序列 是指这样一个新的字符串：它是由原字符串在不改变字符的相对顺序的情况下删除某些字符（也可以不删除任何字符）后组成的新字符串。
 * 例如，"ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。
 * 两个字符串的 公共子序列 是这两个字符串所共同拥有的子序列。
 * 示例 1：
 * 输入：text1 = "abcde", text2 = "ace"
 * 输出：3
 * 解释：最长公共子序列是 "ace" ，它的长度为 3 。
 * 示例 2：
 * 输入：text1 = "abc", text2 = "abc"
 * 输出：3
 * 解释：最长公共子序列是 "abc" ，它的长度为 3 。
 * 示例 3：
 * 输入：text1 = "abc", text2 = "def"
 * 输出：0
 * 解释：两个字符串没有公共子序列，返回 0 。
 * 提示：
 * 1 <= text1.length, text2.length <= 1000
 * text1 和 text2 仅由小写英文字符组成。
 */
public class likou1143 {
    public static void main(String[] args) {
        likou1143 likou1143 = new likou1143();
        String a = "bsbininm";
        String b = "jmjkbkjkv";
        int i = likou1143.longestCommonSubsequence2(a, b);
        System.out.println(i);
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = abs(dp, i, j);
                }
            }
        }
        return dp[m][n];
    }

    private int abs(int[][] dp, int i, int j) {
        return Math.max(dp[i][j], Math.max(dp[i][j - 1], dp[i - 1][j]));
    }

    int[][] memo;
    public int longestCommonSubsequence2(String s1, String s2) {
        int m=s1.length(),n=s2.length();
        memo=new int[m][n];
        for (int[] ints : memo) {
            Arrays.fill(ints,-1);
        }
        return dp(s1,0,s2,0);
    }

    private int dp(String s1, int i, String s2, int j) {
        if (i==s1.length()||j==s2.length())return 0;
        if (memo[i][j]!=-1)return memo[i][j];
        if (s1.charAt(i)==s2.charAt(j))
            memo[i][j]=1+dp(s1, i+1, s2, j+1);
        else
            memo[i][j]=Math.max(dp(s1, i+1, s2, j),dp(s1, i, s2, j+1));
        return memo[i][j];
    }
}
