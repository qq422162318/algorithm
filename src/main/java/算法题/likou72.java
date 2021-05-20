package 算法题;

/**
 * 72. 编辑距离
 * 给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
 * 你可以对一个单词进行如下三种操作：
 * 插入一个字符
 * 删除一个字符
 * 替换一个字符
 * 示例 1：
 * 输入：word1 = "horse", word2 = "ros"
 * 输出：3
 * 解释：
 * horse -> rorse (将 'h' 替换为 'r')
 * rorse -> rose (删除 'r')
 * rose -> ros (删除 'e')
 * 示例 2：
 * 输入：word1 = "intention", word2 = "execution"
 * 输出：5
 * 解释：
 * intention -> inention (删除 't')
 * inention -> enention (将 'i' 替换为 'e')
 * enention -> exention (将 'n' 替换为 'x')
 * exention -> exection (将 'n' 替换为 'c')
 * exection -> execution (插入 'u')
 */
public class likou72 {
    public static void main(String[] args) {
        String s1 = "horse", s2 = "ros";
        int i = minDistance(s1, s2);
        System.out.println(i);
        System.out.println(new likou72().minDistance2(s1, s2));
    }

    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m * n == 0) {
            return m + n;
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                int up = dp[i - 1][j] + 1;
                int left = dp[i][j - 1] + 1;
                int left_up = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    left_up += 1;
                }
                dp[i][j] = Math.min(up, Math.min(left, left_up));
            }
        }
        return dp[m][n];
    }

    static char[] s1 = null;
    static char[] s2 = null;

    /**
     * 有重叠子问题(不建议)
     * @param word1
     * @param word2
     * @return
     */
    public int minDistance2(String word1, String word2) {
        if (word1.length() == 0 || word2.length() == 0) return 0;
        s1 = word1.toCharArray();
        s2 = word2.toCharArray();
        return dp(word1.length() - 1, word2.length() - 1);
    }

    private int dp(int i, int j) {
        if (i == -1) return j + 1;
        if (j == -1) return i + 1;
        if (s1[i] == s2[j]) {
            return dp(i - 1, j - 1);
        } else {
            return Math.min(dp(i, j - 1) + 1, Math.min(dp(i - 1, j) + 1, dp(i - 1, j - 1) + 1));
        }
    }
}
