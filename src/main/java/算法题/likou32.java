package 算法题;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 *
 * 示例 1:
 *
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 * 示例 2:
 *
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class likou32 {
    public static void main(String[] args) {
        //String s="(()";
        String s=")()())";
        int i = longestValidParentheses(s);
        System.out.println(i);
    }
        public static int longestValidParentheses(String s) {
            /*0:‘（’  1：‘）’*/
            if (s == null||s.isEmpty()) return 0;
            Deque<int[]> queue = new ArrayDeque<>();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '(') {
                    queue.push(new int[]{i, 0});
                    continue;
                }
                if (!queue.isEmpty() && queue.peek()[1] == 0)
                    queue.poll();
                else
                    queue.push(new int[]{i, chars[i] == '(' ? 0 : 1});
            }
            if (queue.isEmpty()) return s.length();
            int result = 0;
            int pre = -1;
            while (!queue.isEmpty()) {
                result = Math.max(result, queue.peekLast()[0] - pre);
                pre = queue.pollLast()[0];
            }
            result = Math.max(result, s.length() - pre);
            return result-1;
        }
public static int longestVaildpa(String s){
    int maxans=0;
    int dp[] =new int[s.length()];
        for (int i = 1; i <s.length() ; i++) {
            if (s.charAt(i)==')'){
                dp[i]=( i>=2 ? dp[i-2] : 0)+2;
            }else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                int oo=(i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0;
                dp[i] = dp[i - 1] + oo + 2;
            }
            maxans=Math.max(maxans,dp[i]);
        }
        return maxans;
}
    public static int longestValidParenthesess(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

}
