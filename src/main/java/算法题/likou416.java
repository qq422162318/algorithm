package 算法题;

import java.util.List;

/**
 * 416. 分割等和子集
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * 注意:
 * 每个数组中的元素不会超过 100
 * 数组的大小不会超过 200
 * 示例 1:
 * 输入: [1, 5, 11, 5]
 * 输出: true
 * 解释: 数组可以分割成 [1, 5, 5] 和 [11].
 * 示例 2:
 * 输入: [1, 2, 3, 5]
 * 输出: false
 * 解释: 数组不能分割成两个元素和相等的子集.
 */
public class likou416 {
    public static void main(String[] args) {
       int[] nums=new int[]{1,5,11,5};
        likou416 likou416 = new likou416();
        System.out.println(likou416.canPartition(nums));
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for (int num : nums) {
            sum+=num;
        }
        if (sum%2!=0)return false;
        int n=nums.length;
        sum=sum/2;
        boolean[] dp=new boolean[sum+1];
        dp[0]=true;
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >=0 ; j--) {
                if (j-nums[i]>=0)
                dp[j]=dp[j]||dp[j-nums[i]];
            }
        }
        return dp[sum];
    }
}
