package jieti;

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
        String S = "ADOBECODEBANC", T = "ABC";
        String S2="ABDDCBACEBANC";
        likou76 likou76 = new likou76();

        String s = likou76.minWindow3(S, T);
        System.out.println(s);
    }
    Map<Character, Integer> target = new HashMap<Character, Integer>();
    Map<Character, Integer> curr = new HashMap<Character, Integer>();
    public String minWindow(String s,String t){
        long l1 = System.currentTimeMillis();
        int tLen = t.length();
            for (int i = 0; i < tLen; i++) {
                char c = t.charAt(i);
                target.put(c, target.getOrDefault(c, 0) + 1);
            }
            int l = 0, r = -1;
            int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
            int sLen = s.length();
            while (r < sLen) {
                ++r;
                if (r < sLen && target.containsKey(s.charAt(r))) {
                    curr.put(s.charAt(r), curr.getOrDefault(s.charAt(r), 0) + 1);
                }
                while (check() && l <= r) {
                    if (r - l + 1 < len) {
                        len = r - l + 1;
                        ansL = l;
                        ansR = l + len;
                    }
                    if (target.containsKey(s.charAt(l))) {
                        curr.put(s.charAt(l), curr.getOrDefault(s.charAt(l), 0) - 1);
                    }
                    ++l;
                }
            }
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);
        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }
    public boolean check() {
        Iterator iter = target.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (curr.getOrDefault(key, 0) < val) {
                return false;
            }
        }
        return true;
    }
    public String minWindow2(String s,String t){
        if (s == null || s.length() == 0 || t == null || t.length() ==0) {
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
        while(right < s.length()) {
            char c = s.charAt(right);
            // 窗口右移
            right++;
            // 更新
            if (need.get(c) != null) {
                windows.put(c, windows.getOrDefault(c, 0) + 1);
                if (windows.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while(valid == need.size()) {
                if (right - left < len) {
                    len = right - left;
                    start = left;
                }
                char leftChar = s.charAt(left);
                left++;
                if (need.get(leftChar) != null) {
                    windows.put(leftChar, windows.get(leftChar) - 1);
                    if (windows.get(leftChar) + 1 == need.get(leftChar)) {
                        valid--;
                    }
                }
            }
        }
        return (len == Integer.MAX_VALUE ? "" : s.substring(start, start + len));
    }
    public String minWindow3(String s,String t){
        int[] mp = new int[256];
        for (char c : t.toCharArray())
            mp[c] += 1;
        int start = 0, end = 0;
        int sLen = s.length(), tLen = t.length();
        int cnt = 0;
        int res = -1;
        String ans = "";
        while (end < sLen) {
            char c = s.charAt(end);
            mp[c] -= 1;
            if (mp[c] >= 0)
                cnt += 1;
            while (cnt == tLen) {
                if (res == -1 || res > end - start + 1) {
                    ans = s.substring(start, end + 1);
                    res = end - start + 1;
                }
                c = s.charAt(start);
                mp[c] += 1;
                if (mp[c] >= 1)
                    cnt -= 1;
                start += 1;
            }
            end += 1;
        }
        return ans;
    }
}
