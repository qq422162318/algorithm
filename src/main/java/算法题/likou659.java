package 算法题;

import java.util.HashMap;

/**
 * 659. 分割数组为连续子序列
 * 给你一个按升序排序的整数数组 num（可能包含重复数字），请你将它们分割成一个或多个长度至少为 3 的子序列，其中每个子序列都由连续整数组成。
 * 如果可以完成上述分割，则返回 true ；否则，返回 false 。
 * 示例 1：
 * 输入: [1,2,3,3,4,5]
 * 输出: True
 * 解释:
 * 你可以分割出这样两个连续子序列 :
 * 1, 2, 3
 * 3, 4, 5
 * 示例 2：
 * 输入: [1,2,3,3,4,4,5,5]
 * 输出: True
 * 解释:
 * 你可以分割出这样两个连续子序列 :
 * 1, 2, 3, 4, 5
 * 3, 4, 5
 * 示例 3：
 * 输入: [1,2,3,4,4,5]
 * 输出: False
 */
public class likou659 {
    public static void main(String[] args) {
        likou659 likou = new likou659();
        int[] nums = {1, 2, 3, 3, 4, 5};
        System.out.println(likou.isPossible(nums));
    }

    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> need = new HashMap<>();
        int n = nums.length;
        for (int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        for (int i = 0; i < n; i++) {
            if (freq.get(nums[i]) == 0) continue;
            if (need.containsKey(nums[i]) && need.get(nums[i]) > 0) {
                need.put(nums[i], need.getOrDefault(nums[i], 0) - 1);
                freq.put(nums[i], freq.get(nums[i]) - 1);
                need.put(nums[i] + 1, need.getOrDefault(nums[i] + 1, 0) + 1);
            } else if (freq.get(nums[i]) > 0 && freq.getOrDefault(nums[i] + 1, 0) > 0 && freq.getOrDefault(nums[i] + 2, 0) > 0) {
                freq.put(nums[i], freq.get(nums[i]) - 1);
                freq.put(nums[i] + 1, freq.get(nums[i] + 1) - 1);
                freq.put(nums[i] + 2, freq.get(nums[i] + 2) - 1);
                need.put(nums[i] + 3, need.getOrDefault(nums[i] + 3, 0) + 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
