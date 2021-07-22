package 算法题;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 224. 基本计算器
 * 给你一个字符串表达式 s ，请你实现一个基本计算器来计算并返回它的值。
 * 示例 1：
 * 输入：s = "1 + 1"
 * 输出：2
 * 示例 2：
 * 输入：s = " 2-1 + 2 "
 * 输出：3
 * 示例 3：
 * 输入：s = "(1+(4+5+2)-3)+(6+8)"
 * 输出：23
 * 提示：
 * 1 <= s.length <= 3 * 105
 * s 由数字、'+'、'-'、'('、')'、和 ' ' 组成
 * s 表示一个有效的表达式
 */
public class likou224 {
    public static void main(String[] args) {
        likou224 likou224 = new likou224();
        System.out.println(likou224.calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    public int calculate(String s) {
        if (s.equals("")) return 0;
        int n = s.length();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.charAt(i));
        }
        return helper(list);
    }

    private int helper(LinkedList<Character> list) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < list.size(); i++) {
            char c = list.poll();
            if (isdigit(c))
                num = 10 * num + (c - '0');
            if (c == '(') helper(list);
            if (!isdigit(c) && c != ' ' || i == list.size() - 1) {
                int pre = 0;
                switch (sign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        pre = stack.pop();
                        stack.push(pre * num);
                        break;
                    case '/':
                        pre = stack.pop();
                        stack.push(pre / num);
                        break;
                }
                sign = c;
                num = 0;
            }
            if (c == ')') break;
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    private boolean isdigit(char c) {
        return c >= '0' && c <= '9' ? true : false;
    }
}
