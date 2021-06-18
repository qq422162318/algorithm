package 算法题;

/**
 * 什么是KMP算法：
 * <p>
 * KMP是三位大牛：D.E.Knuth、J.H.Morris和V.R.Pratt同时发现的。
 * 其中第一位就是《计算机程序设计艺术》的作者！！
 * <p>
 * KMP算法要解决的问题就是在字符串（也叫主串）中的模式（pattern）定位问题。
 * 说简单点就是我们平时常说的关键字搜索。模式串就是关键字（接下来称它为P），
 * 如果它在一个主串（接下来称为T）中出现，就返回它的具体位置，否则返回-1（常用手段）。
 */
public class KMP {
    public static void main(String[] args) {
        String s = "dsjkflsjflksdjfkldjfksldjfskdlfjsdklfjsldkjflsdkjfsdklfuiop";
        String t = "uiop";
        String kp = "ababc";
        int[] next = getNext(kp);
        System.out.println(KMP(s, t));
        KMP kmp = new KMP();
        int i = kmp.kmp(s, t);
        System.out.println(i);
    }

    public static int[] getNext(String ps) {
        char[] p = ps.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1) {
            if (k == -1 || p[j] == p[k]) {
                next[++j] = ++k;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static int KMP(String ts, String ps) {
        char[] t = ts.toCharArray();
        char[] p = ps.toCharArray();
        int i = 0, j = 0;
        int[] next = getNext(ps);
        while (i < t.length && j < p.length) {
            if (j == -1 || t[i] == p[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == p.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    public int[] next_int(String p) {
        char[] chars = p.toCharArray();
        int[] next = new int[chars.length];
        int k = 0;
        next[0] = 0;
        int j = 1;
        while (j < chars.length - 1) {
            if (chars[j] == chars[k]) {
                next[++j] = ++k;
            } else if (j > 0) {
                k = next[j] = next[j - 1];
                j++;
            } else {
                ++j;
            }
        }
        return next;
    }

    public int kmp(String s, String t) {
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        int[] next = next_int(t);
        int i = 0;
        int k = 0;
        while (i < ss.length && k < ts.length) {
            if (k == 0 || ss[i] == ts[k]) {
                i++;
                k++;
            } else {
                k = next[k];
            }
        }
        if (k == ts.length) {
            return i - k;
        } else {
            return -1;
        }
    }

    /**
     * labuladong kmp
     */
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
                if (j == n) return i - m + 1;
            }
            return -1;
        }
    }
}
