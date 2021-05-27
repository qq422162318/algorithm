package 算法题;

import java.util.Arrays;

/**
 * 300. 最长递增子序列
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 * 示例 1：
 * 输入：nums = [10,9,2,5,3,7,101,18]
 * 输出：4
 * 解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
 * 示例 2：
 * 输入：nums = [0,1,0,3,2,3]
 * 输出：4
 * 示例 3：
 * 输入：nums = [7,7,7,7,7,7,7]
 * 输出：1
 * 提示：
 * 1 <= nums.length <= 2500
 * -104 <= nums[i] <= 104
 */
public class likou300 {
    public static void main(String[] args) {
        int[] nums=new int[]{10,9,2,5,3,7,101,18};
        System.out.println(new likou300().lengthOfLIS2(nums));
    }
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int length = nums.length;
        int[] dp = new int[length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        int res = 0;
        for (int i : dp) {
            res = Math.max(res, i);
        }
        return res;
    }

    public int lengthOfLIS2(int[] nums) {
        if (nums.length == 0) return 0;
        int n = nums.length;
        int[] top = new int[n];
        int piles = 0;
        for (int i = 0; i < n; i++) {
            int poker = nums[i];
            int left = 0, right = piles;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (top[mid] > poker)
                    right = mid;
                else if (top[mid] < poker)
                    left = mid + 1;
                else
                    right = mid;
            }
            if (left == piles) piles++;
            top[left] = poker;
        }
        return piles;
    }
}
