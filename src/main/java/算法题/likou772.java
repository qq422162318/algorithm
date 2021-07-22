package 算法题;

import java.util.Stack;

/**
 * 227. 基本计算器 III
 * 给你一个字符串表达式 s ，请你实现一个基本计算器来计算并返回它的值。
 * 整数除法仅保留整数部分。
 * 实现一个基本的计算器来计算一个简单的表达式字符串。
 * 表达式字符串可能包含左括号（和右括号）、加号 + 或减号 -、非负整数和空格。
 * 表达式字符串仅包含非负整数、+、-、*、/ 运算符、开（和右括号）和空格。
 * 整数除法应向零截断。
 * 您可以假设给定的表达式始终有效。
 * 所有中间结果都将在 [-2147483648, 2147483647] 范围内
 * 示例 1：
 * 输入：s ="1 + 1"
 * 输出：2
 * 示例 2：
 * 输入：s =" 6-4 / 2 "
 * 输出：4
 * 示例 3：
 * 输入：s ="2*(5+5*2)/3+(6/2+8)"
 * 输出：21
 * 示例 4：
 * 输入：s ="(2+6* 3+5- (3*14/7+2)*5)+3"
 * 输出：-12
 */
public class likou772 {
    public static void main(String[] args) {
        likou772 likou772 = new likou772();
        System.out.println(likou772.calculate("2*(5+5*2)"));
    }

    public int calculate(String s) {
        s = s.replaceAll(" ", "");
        if (s.length() == 0) return 0;
        Stack<Integer> sta = new Stack<>();
        char sign = '+';
        int res = 0, num = 0, i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                num = num * 10 + (c - '0');
            if (c == '(') {
                int j = findClosing(s);
                num = calculate(s.substring(i + 1, j));
                i += j-i;
            }
            if (!Character.isDigit(c) || i == s.length() - 1) {
                int pre;
                switch (sign) {
                    case '+':
                        sta.push(num);
                        break;
                    case '-':
                        sta.push(-num);
                        break;
                    case '*':
                        pre = sta.pop();
                        sta.push(pre * num);
                        break;
                    case '/':
                        pre = sta.pop();
                        sta.push(pre / num);
                        break;
                }
                sign = c;
                num = 0;
            }
            i++;
        }
        while (!sta.isEmpty())
            res += sta.pop();
        return res;
    }

    private int findClosing(String s) {
        int level = 0, i = 0;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') level++;
            else if (s.charAt(i) == ')') {
                level--;
                if (level == 0) break;
            } else
                continue;
        }
        return i;
    }
}
