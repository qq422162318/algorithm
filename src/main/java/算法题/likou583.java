package 算法题;

/**
 * 583. 两个字符串的删除操作
 * 给定两个单词 word1 和 word2，找到使得 word1 和 word2 相同所需的最小步数，每步可以删除任意一个字符串中的一个字符。
 * 示例：
 * 输入: "sea", "eat"
 * 输出: 2
 * 解释: 第一步将"sea"变为"ea"，第二步将"eat"变为"ea"
 * 提示：
 * 给定单词的长度不超过500。
 * 给定单词中的字符只含有小写字母。
 */
public class likou583 {
    public int minDistance(String word1, String word2) {
        if (word1.length()==0||word2.length()==0)return 0;
        int m=word1.length(),n=word2.length();
        int lcs=longestCommonSubsequence(word1, word2);
        return m-lcs+n-lcs;
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
}
