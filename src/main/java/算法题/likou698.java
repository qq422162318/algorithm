package 算法题;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 698. 划分为k个相等的子集
 * 给定一个整数数组  nums 和一个正整数 k，找出是否有可能把这个数组分成 k 个非空子集，其总和都相等。
 * 示例 1：
 * 输入： nums = [4, 3, 2, 3, 5, 2, 1], k = 4
 * 输出： True
 * 说明： 有可能将其分成 4 个子集（5），（1,4），（2,3），（2,3）等于总和。
 * 提示：
 * 1 <= k <= len(nums) <= 16
 * 0 < nums[i] < 10000
 */
public class likou698 {
    public static void main(String[] args) {
        likou698 likou698 = new likou698();
        int[] n = {4, 3, 2, 3, 5, 2, 1};
//        int[] n = {2,2,2,2,3,4,5};
        System.out.println(likou698.canPartitionKSubsets(n, 4));
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (k > nums.length) return false;
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % k != 0) return false;
        int[] bucket = new int[k];
        int target = sum / k;
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        for (; i < j; i++, j--) {
            // 交换 nums[i] 和 nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return backtrack(nums, 0, bucket, target);
    }

    private boolean backtrack(int[] nums, int index, int[] bucket, int target) {
        if (index == nums.length) {
            for (int i = 0; i < bucket.length; i++) {
                if (bucket[i] != target) return false;
            }
            return true;
        }
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] + nums[index] > target) continue;
            bucket[i] += nums[index];
            if (backtrack(nums, index + 1, bucket, target))
                return true;
            bucket[i] -= nums[index];
        }
        return false;
    }

    /**
     * 最快
     * 执行用时：
     * 1 ms
     * @param nums
     * @param k
     * @return
     */
    public boolean canPartitionKSubsets3(int[] nums, int k) {
        // 排除一些基本情况
        if (k > nums.length) return false;
        int sum = 0;
        for (int v : nums) sum += v;
        if (sum % k != 0) return false;
        boolean[] used = new boolean[nums.length];
        int target = sum / k;
        // k 号桶初始什么都没装，从 nums[0] 开始做选择
        return backtrack(k, 0, nums, 0, used, target);
    }
    private boolean backtrack(int k, int bucket, int[] nums, int start, boolean[] used, int target) {
        if (k == 0) return true;
        if (bucket == target) return backtrack(k - 1, 0, nums, 0, used, target);
        for (int i = start; i < nums.length; i++) {
            if (used[i]) continue;
            if (nums[i] + bucket > target) continue;
            used[i] = true;
            bucket += nums[i];
            if (backtrack(k, bucket, nums, i + 1, used, target))
                return true;
            used[i] = false;
            bucket -= nums[i];
        }
        return false;
    }
}
