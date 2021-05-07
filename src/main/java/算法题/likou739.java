package 算法题;

import java.util.Stack;

/**
 * 739. 每日温度
 * 请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 * <p>
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * <p>
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
 */
public class likou739 {
    public static void main(String[] args) {
        int nums[] = {73, 74, 75, 71, 69, 72, 76, 73};
        likou739 likou739 = new likou739();
        int[] ints = likou739.dailyTemperatures(nums);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        for (int i = length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && T[stack.peek()] <= T[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                temp.push(stack.peek() - i);
            } else {
                temp.push(0);
            }
            stack.push(i);
        }
        int sz = temp.size();
        int[] res = new int[sz];
        for (int i = 0; i < sz; i++) {
            res[i] = temp.pop();
        }
        return res;
    }
}
