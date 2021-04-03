package 算法题;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 力扣第 1118 题「一月有多少天」：
 *
 * 给你一个数组T，这个数组存放的是近几天的天气气温，你返回一个等长的数组，计算：对于每一天，你还要至少等多少天才能等到一个更暖和的气温；如果等不到那一天，填 0。
 */
public class likou1118 {
    public static void main(String[] args) {
        likou1118 likou1118 = new likou1118();
        int[] ints = {73, 74, 75, 71, 69, 76};
        System.out.println(likou1118.dailyTemperatures(ints));
    }
    public List<Integer> dailyTemperatures(int[] nums){
        int length = nums.length;
        ArrayList<Integer> res = new ArrayList<>(length);
        Stack<Integer> stack = new Stack<>();
        //调用单调栈的算法模板
        for (int i = length - 1; i >= 0; i--) {
            while(!stack.isEmpty()&&nums[stack.peek()]<=nums[i]){
                stack.pop();
            }
            res.add(stack.empty()?0:(stack.peek()-i));
            stack.push(i);
        }
        return res;
    }
}
