package 算法.栈;

import 算法.栈.Stack;

public class StackTest {
    public static void main(final String[] args) {
        final Stack<String> stack = new Stack<>();

        // 测试压栈
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        for (final Object item : stack) {
            System.out.println(item);
        }
        System.out.println("------------------");
        final String result = stack.pop();
        System.out.println(result);
        System.out.println(stack.size());
    }
}
