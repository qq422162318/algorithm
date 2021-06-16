package 算法题;

import java.util.Arrays;

/**
 * 198. 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * 示例 1：
 * 输入：[1,2,3,1]
 * 输出：4
 * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2：
 * 输入：[2,7,9,3,1]
 * 输出：12
 * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 * 偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 */
public class likou198 {
    public static void main(String[] args) {
//        int[] num={1,2,3,1};
        int[] num = {2, 7, 9, 3, 1};
        likou198 likou198 = new likou198();
        int rob = likou198.rob2(num);
        System.out.println(rob);
    }

    //自底向上
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int length = nums.length;
        if (length == 1) return nums[0];
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }

    //自顶向下
    public int rob3(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int length = nums.length;
        if (length == 1) return nums[0];
        int[] dp = new int[length + 2];
        for (int i = length - 1; i >= 0; i--) {
            dp[i] = Math.max(dp[i + 2] + nums[i], dp[i + 1]);
        }
        return dp[0];
    }

    public int rob4(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int length = nums.length;
        int dp_i2 = 0, res = 0, dp_i1 = 0;
        for (int i = length - 1; i >= 0; i--) {
            res = Math.max(dp_i2 + nums[i], dp_i1);
            dp_i2 = dp_i1;
            dp_i1 = res;
        }
        return res;
    }

    //带备忘录的递归解法
    private int[] memo;

    public int rob2(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return dp(nums, 0);
    }

    private int dp(int[] nums, int start) {
        if (start >= nums.length) return 0;
        if (memo[start] != -1) return memo[start];
        int res = Math.max(
                dp(nums, start + 1),
                nums[start] + dp(nums, start + 2)
        );
        memo[start] = res;
        return res;
    }
}
