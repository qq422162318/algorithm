package 算法题;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.util.HashMap;

/**
 * 494. 目标和
 * 给你一个整数数组 nums 和一个整数 target 。
 * 向数组中的每个整数前添加 '+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ：
 * 例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，然后串联起来得到表达式 "+2-1" 。
 * 返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。
 * 示例 1：
 * 输入：nums = [1,1,1,1,1], target = 3
 * 输出：5
 * 解释：一共有 5 种方法让最终目标和为 3 。
 * -1 + 1 + 1 + 1 + 1 = 3
 * +1 - 1 + 1 + 1 + 1 = 3
 * +1 + 1 - 1 + 1 + 1 = 3
 * +1 + 1 + 1 - 1 + 1 = 3
 * +1 + 1 + 1 + 1 - 1 = 3
 * 示例 2：
 * 输入：nums = [1], target = 1
 * 输出：1
 * 提示：
 * 1 <= nums.length <= 20
 * 0 <= nums[i] <= 1000
 * 0 <= sum(nums[i]) <= 1000
 * -1000 <= target <= 100
 */
public class likou494 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};
        System.out.println(new likou494().findTargetSumWays(nums,3));
    }

    int result = 0;
    public int findTargetSumWays(int[] nums, int target) {
        if (nums.length == 0) return 0;
        backTrack(nums, 0, target);
        return result;
    }
    private void backTrack(int[] nums, int i, int target) {
        if (i == nums.length) {
            if (target == 0)
                result++;
            return;
        }
        //选中-
        target += nums[i];
        backTrack(nums, i + 1, target);
        target -= nums[i];
        //选中+
        target -= nums[i];
        backTrack(nums, i + 1, target);
        target += nums[i];

    }

    int findTargetSumWays2(int[] nums, int target) {
        if (nums.length == 0) return 0;
        return dp(nums, 0, target);
    }
    // 备忘录
    HashMap<String, Integer> memo = new HashMap<>();
    int dp(int[] nums, int i, int rest) {
        // base case
        if (i == nums.length) {
            if (rest == 0) return 1;
            return 0;
        }
        // 把它俩转成字符串才能作为哈希表的键
        String key = i + "," + rest;
        // 避免重复计算
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        // 还是穷举
        int result = dp(nums, i + 1, rest - nums[i]) + dp(nums, i + 1, rest + nums[i]);
        // 记入备忘录
        memo.put(key, result);
        return result;
    }
}
