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

        System.out.println(likou698.canPartitionKSubsets2(n, 4));
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

    public boolean canPartitionKSubsets2(int[] nums, int k) {
        if (k > nums.length) return false;
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % k != 0) return false;
        int[] bucket = new int[k];
        int target = sum / k;
        Arrays.sort(nums);
        return backtrack2(nums, nums.length - 1, k, bucket);
    }

    private boolean backtrack2(int[] nums, int cur, int k, int[] bucket) {
        if (cur < 0) return true;
        for (int i = 0; i < k; i++) {
            if (bucket[i] == nums[cur] || bucket[i] - nums[cur] > nums[0]) {
                bucket[i] -= nums[cur];
                if (backtrack2(nums, cur + 1, k, bucket)) return true;
                bucket[i] += nums[cur];
            }
        }
        return false;
    }
}
