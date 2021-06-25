package 算法题;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 示例 1：
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 * 输入：n = 1
 * 输出：["()"]
 */
public class likou22 {
    public static void main(String[] args) {
        likou22 likou = new likou22();
        List<String> strings = likou.generateParenthesis(3);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    ArrayList<String> res;

    public List<String> generateParenthesis(int n) {
        if (n == 0) return null;
        res = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        backtrack(n, n, stack);
        return res;
    }

    private void backtrack(int left, int right, Stack<Character> stack) {
        if (left > right) return;
        if (left < 0 || right < 0) return;
        if (left == 0 && right == 0) {
            StringBuilder str = new StringBuilder();
            for (Character character : stack) {
                str.append(character);
            }
            res.add(str.toString());
            return;
        }

        stack.push('(');
        backtrack(left - 1, right, stack);
        stack.pop();

        stack.push(')');
        backtrack(left, right - 1, stack);
        stack.pop();
    }
}
