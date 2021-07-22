package 算法题;

import java设计模式.状态模式.State;

import java.util.Stack;

/**
 * 227. 基本计算器 II
 * 给你一个字符串表达式 s ，请你实现一个基本计算器来计算并返回它的值。
 * <p>
 * 整数除法仅保留整数部分。
 * 示例 1：
 * 输入：s = "3+2*2"
 * 输出：7
 * 示例 2：
 * 输入：s = " 3/2 "
 * 输出：1
 * 示例 3：
 * 输入：s = " 3+5 / 2 "
 * 输出：5
 * 提示：
 * 1 <= s.length <= 3 * 105
 * s 由整数和算符 ('+', '-', '*', '/') 组成，中间由一些空格隔开
 * s 表示一个 有效表达式
 * 表达式中的所有整数都是非负整数，且在范围 [0, 231 - 1] 内
 * 题目数据保证答案是一个 32-bit 整数
 */
public class likou227 {
    public static void main(String[] args) {
        likou227 likou227 = new likou227();
        System.out.println(likou227.calculate(" 3 + 2 *2 "));
    }

    public int calculate(String s) {
        if (s.equals("")) return 0;
        int n = s.length();
        Stack<Integer> sta = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                num = num * 10 + (c - '0');
            if (!Character.isDigit(c) && c != ' ' || i == n - 1) {
                int pre = 0;
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
        }
        int sum = 0;
        while (!sta.isEmpty()) {
            sum += (int) sta.pop();
        }
        return sum;
    }
}
