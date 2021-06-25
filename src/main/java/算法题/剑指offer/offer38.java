package 算法题.剑指offer;

import sun.util.locale.provider.FallbackLocaleProviderAdapter;
import java.util.*;

/**
 * 剑指 Offer 38. 字符串的排列
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 * 示例:
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 * 限制：
 * 1 <= s 的长度 <= 8
 */
public class offer38 {
    public static void main(String[] args) {
        offer38 offer = new offer38();
        String s = "aab";
        String[] permutation = offer.permutation(s);
        for (String s1 : permutation) {
            System.out.print(s1 + "\t");
        }
    }

    public String[] permutation(String s) {
        if (s.length() == 0) return null;
        char[] chars = s.toCharArray();
        res = new HashSet<>();
        track(chars, "", new int[chars.length]);
        return res.toArray(new String[res.size()]);
    }

    Set<String> res;

    private void track(char[] chars, String s, int[] flag) {
        if (s.length() == chars.length) {
            res.add(s);
        }
        for (int i = 0; i < chars.length; i++) {
            if (flag[i] == 1) continue;
            flag[i] = 1;
            track(chars, s + String.valueOf(chars[i]), flag);
            flag[i] = 0;
        }
    }
}
