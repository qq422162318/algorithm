package 算法题;

import java.util.Stack;

/**
 * 921. 使括号有效的最少添加
 * 给定一个由 '(' 和 ')' 括号组成的字符串 S，我们需要添加最少的括号（ '(' 或是 ')'，可以在任何位置），以使得到的括号字符串有效。
 * 从形式上讲，只有满足下面几点之一，括号字符串才是有效的：
 * 它是一个空字符串，或者
 * 它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者
 * 它可以被写作 (A)，其中 A 是有效字符串。
 * 给定一个括号字符串，返回为使结果字符串有效而必须添加的最少括号数。
 * 示例 1：
 * 输入："())"
 * 输出：1
 * 示例 2：
 * 输入："((("
 * 输出：3
 * 示例 3：
 * 输入："()"
 * 输出：0
 * 示例 4：
 * 输入："()))(("
 * 输出：4
 */
public class likou921 {
    public static void main(String[] args) {
        String s = "()))((";
        likou921 likou921 = new likou921();
        System.out.println(likou921.minAddToMakeValid2(s));
    }

    public int minAddToMakeValid(String s) {
        while (s.contains("()"))
            s = s.replace("()", "");
        return s.length();
    }

    public int minAddToMakeValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push('(');
                continue;
            }
            if (!stack.isEmpty() && c == get(stack.peek())) {
                stack.pop();
                continue;
            }
            stack.push(')');
        }
        return stack.size();
    }

    private char get(Character peek) {
        if (peek == '(') return ')';
        return '1';
    }

    public int minAddToMakeValid3(String s) {
        int res=0;
        int need=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(') need++;
            if (s.charAt(i)==')'){
                need--;
                if (need==-1){
                    need=0;
                    res++;
                }
            }
        }
        return res+need;
    }
}
