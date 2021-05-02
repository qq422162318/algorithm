package 算法题;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 76. 最小覆盖子串
 * 给你一个字符串 S、一个字符串 T 。请你设计一种算法，可以在 O(n) 的时间复杂度内，从字符串 S 里面找出：包含 T 所有字符的最小子串。
 * 示例：
 * 输入：S = "ADOBECODEBANC", T = "ABC"
 * 输出："BANC"
 * 提示：
 * 如果 S 中不存这样的子串，则返回空字符串 ""。
 * 如果 S 中存在这样的子串，我们保证它是唯一的答案。
 */
public class likou76 {
    public static void main(String[] args) {
//        String S = "ADOBECODEBANC", T = "ABC";
        String S = "aa", T = "aa";

        likou76 likou76 = new likou76();
        String s = likou76.minWindow(S, T);
        System.out.println(s);
    }

    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "";
        }
        // valid为有效的 len为目标长度
        int left = 0, right = 0, valid = 0, len = Integer.MAX_VALUE, start = 0;
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> windows = new HashMap<>();
        // 初始化need
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        while (right < s.length()) {
            char c = s.charAt(right);
            // 窗口右移
            right++;
            // 更新
            if (need.containsKey(c)) {
                //只添加need中有的字符
                windows.put(c, windows.getOrDefault(c, 0) + 1);
                //valid 变量表示窗口中满足 need 条件的字符个数，如果 valid 和 need.size 的大小相同，
                // 则说明窗口已满足条件，已经完全覆盖了串 T
                if (windows.get(c) == need.get(c)) {
                    valid++;
                }
            }
            // 判断左侧窗口是否要收缩 need.size()注意多个重复字母
            while (valid == need.size()) {
                // 在这里更新最小覆盖子串
                if (right - left < len) {
                    len = right - left;
                    start = left;
                }
                char leftChar = s.charAt(left);
                left++;
                if (need.containsKey(leftChar)) {
                    //因为left++滑动窗口将字符串移除
                    windows.put(leftChar, windows.get(leftChar) - 1);
                    if (windows.get(leftChar) < need.get(leftChar)) {
                        valid--;
                    }

                }
            }
        }
        return (len == Integer.MAX_VALUE ? "" : s.substring(start, start + len));
    }
}
