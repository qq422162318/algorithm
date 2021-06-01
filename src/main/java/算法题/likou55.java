package 算法题;

/**
 * 55. 跳跃游戏
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个位置。
 * 示例 1:
 * 输入: []
 * 输出: true
 * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 * 示例 2:
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 */
public class likou55 {
    public static void main(String[] args) {
        likou55 likou55 = new likou55();
        int[] nums = {2, 3, 1, 1, 4};
        boolean b = likou55.canJump2(nums);
        System.out.println(b);
    }

    public boolean canJump(int[] nums) {
        if (nums.length <= 0) return true;
        int n = nums.length;
        int far = 0;
        for (int i = 0; i < n - 1; i++) {
            far = Math.max(far, i + nums[i]);
            if (far <= i) return false;
        }
        return far >= n - 1;
    }

    /**
     * max当前能跳的最远距离
     * @param nums
     * @return
     */
    public boolean canJump2(int[] nums) {
        if (nums.length <= 0) return true;
        int max = nums[0];
        int len = nums.length;
        for (int i = 1; i < len - 1; i++) {
            if (i <= max) {
                max = Math.max(max, nums[i] + i);
            }
        }
        return max >= len - 1;
    }
}
