package 算法题.剑指offer;

import java.util.Arrays;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/14c0359fb77a48319f0122ec175c9ada
 * 来源：牛客网
 * <p>
 * 有三种葡萄，每种分别有\mathit a,b,ca,b,c颗。有三个人，第一个人只吃第
 * 1,2种葡萄，第二个人只吃第2,3种葡萄，第三个人只吃第1,3种葡萄。
 * 适当安排三个人使得吃完所有的葡萄,并且且三个人中吃的最多的那个人吃得尽量少。
 * 输入描述:
 * 第一行数字T，表示数据组数。
 * 接下来T行，每行三个数a,b,c
 * 1 <= a,b,c <= 10^{18} , 1≤T≤10 ,1≤a,b,c≤10
 * 输出描述:
 * 对于每组数据，输出一行一个数字表示三个人中吃的最多的那个人吃的数量
 * 示例1:
 * 输入
 * 2
 * 1 2 3
 * 1 2 6
 * 输出
 * 2
 * 3
 * 示例2
 * 输入
 * 1
 * 12 13 11
 * 输出
 * 12
 */
public class 吃葡萄 {
    public static void main(String[] args) {
        吃葡萄 main = new 吃葡萄();
        int[][] ii = new int[][]{
                {6, 5, 7},
                {3, 2, 1},
                {9, 8, 3},
                {3, 2, 1},
                {1, 7, 10},
                {8, 1, 3},
                {1, 5, 3},
                {2, 1, 1},
                {3, 2, 1},
                {5, 2, 1}
        };
        for (int[] ints : ii) {
            System.out.println(main.solution(ints[0],ints[1],ints[2]));
        }
        System.out.println(main.solution(1, 2, 6));
    }

    long solution(long a, long b, long c) {
        long[] nums = {a, b, c};
        Arrays.sort(nums);
        long sum = a + b + c;
        if (nums[0] + nums[1] > nums[2]) {
            return (sum + 2) / 3;
        } else if (2 * (nums[0] * nums[1]) < nums[2]) {
            return (nums[2] + 1) / 2;
        }
        return (sum + 2) / 3;
    }
}
