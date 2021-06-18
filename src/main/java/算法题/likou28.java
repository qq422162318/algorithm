package 算法题;

/**
 * 28. 实现 strStr()
 * 实现 strStr() 函数。
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 * 说明：
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
 * 示例 1：
 * 输入：haystack = "hello", needle = "ll"
 * 输出：2
 * 示例 2：
 * 输入：haystack = "aaaaa", needle = "bba"
 * 输出：-1
 * 示例 3：
 * 输入：haystack = "", needle = ""
 * 输出：0
 */
public class likou28 {
    public static void main(String[] args) {
        likou28 likou28 = new likou28();
        System.out.println(likou28.strStr("hello", "ll"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        kmp kmp = new kmp(needle);
        int search = kmp.search(haystack);
        return search;
    }

    public class kmp {
        private int[][] dp;
        private String pat;

        public kmp(String pat) {
            this.pat = pat;
            int m = pat.length();
            dp = new int[m][256];
            dp[0][pat.charAt(0)] = 1;
            int x = 0;
            for (int j = 1; j < m; j++) {
                for (int c = 0; c < 256; c++) {
                    if (pat.charAt(j) == c)
                        dp[j][c] = j + 1;
                    else
                        dp[j][c] = dp[x][c];
                }
                x = dp[x][pat.charAt(j)];
            }
        }

        public int search(String txt) {
            int m = pat.length();
            int n = txt.length();
            int j = 0;
            for (int i = 0; i < n; i++) {
                j = dp[j][txt.charAt(i)];
                if (j == m) return i - m + 1;
            }
            return -1;
        }
    }
}
