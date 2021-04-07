package 算法题;

import java.util.Stack;

/**
 * 42. 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * <p>
 * <p>
 * s
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 感谢 Marcos 贡献此图。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 */
public class likou42 {
    public static void main(String[] args) {
        int[] num = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = trap(num);
        System.out.println("result+++++++:" + result);
    }

    public static int trap1(int[] height) {
        int res = 0;
        // 遍历每个柱子
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = 0, rightMax = 0;
            // 计算当前柱子左侧的柱子中的最大高度
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            // 计算当前柱子右侧的柱子中的最大高度
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            // 结果中累加当前柱子顶部可以储水的高度，
            // 即 当前柱子左右两边最大高度的较小者 - 当前柱子的高度。
            res += Math.min(leftMax, rightMax) - height[i];
        }
        return res;
    }

    public static int trap2(int[] nums) {
        int ans = 0, leftIndex = 0, rightIndex = nums.length - 1;
        int leftMax = 0, rightMax = 0;
        while (leftIndex <= rightIndex) {
            if (leftMax <= rightMax) {
                leftMax = Math.max(leftMax, nums[leftIndex]);
                ans += leftMax - nums[leftIndex];
                leftIndex++;
            } else {
                rightMax = Math.max(rightMax, nums[rightIndex]);
                ans += rightMax - nums[rightIndex];
                rightIndex--;
            }
        }
        return ans;
    }

    /**
     * 双指针 思路
     * @param nums
     * @return
     */
    public static int trap(int[] nums) {
        if (nums.length == 0) return 0;
        int n = nums.length;
        int right = n - 1, left = 0, res = 0;
        int l_max = nums[0], r_max = nums[n - 1];
        while (left <= right) {
            l_max = Math.max(l_max, nums[left]);
            r_max = Math.max(r_max, nums[right]);

            if (l_max<r_max){
                res+=l_max-nums[left];
                left++;
            }else{
                res+=r_max-nums[right];
                right--;
            }
        }
        return res;
    }
}
