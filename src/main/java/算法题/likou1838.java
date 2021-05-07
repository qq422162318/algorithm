package 算法题;

import java.util.Arrays;

/**
 * 1838. 最高频元素的频数
 * 元素的 频数 是该元素在一个数组中出现的次数。
 * 给你一个整数数组 nums 和一个整数 k 。在一步操作中，你可以选择 nums 的一个下标，并将该下标对应元素的值增加 1 。
 * 执行最多 k 次操作后，返回数组中最高频元素的 最大可能频数 。
 * 示例 1：
 * 输入：nums = [1,2,4], k = 5
 * 输出：3
 * 解释：对第一个元素执行 3 次递增操作，对第二个元素执 2 次递增操作，此时 nums = [4,4,4] 。
 * 4 是数组中最高频元素，频数是 3 。
 * 示例 2：
 * 输入：nums = [1,4,8,13], k = 5
 * 输出：2
 * 解释：存在多种最优解决方案：
 * - 对第一个元素执行 3 次递增操作，此时 nums = [4,4,8,13] 。4 是数组中最高频元素，频数是 2 。
 * - 对第二个元素执行 4 次递增操作，此时 nums = [1,8,8,13] 。8 是数组中最高频元素，频数是 2 。
 * - 对第三个元素执行 5 次递增操作，此时 nums = [1,4,13,13] 。13 是数组中最高频元素，频数是 2 。
 * 示例 3：
 * 输入：nums = [3,9,6], k = 2
 * 输出：1
 * 提示：
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 * 1 <= k <= 105
 */
public class likou1838 {
    public int maxFrequency(int[] nums, int k) {
        int left = 0, right = nums.length, curIndex = 1;
        int max = 1;
        Arrays.sort(nums);
        int total = 0;
        while (curIndex < right) {
            //求当前值到边界最左数的值的 达到每个值都跟此值相同的+1次数
            total += (nums[curIndex] - nums[curIndex - 1]) * (curIndex-left);
            while(total>k){
                //如果超出就把边界最左+1 并减去左值到此值的差
                total-=nums[curIndex]-nums[left];
                left++;
            }
            //频数
            max=Math.max(curIndex-left+1,max);
            curIndex++;
        }
        return max;
    }
}
