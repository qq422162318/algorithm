package jieti;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 *
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解
 */
public class likou53 {
    public static void main(String[] args) {
        int[] nums={-1,1,-3,4,-1,2,1,-5,4};
        likou53 likou53 = new likou53();
        int i = likou53.maxSubArray(nums);
        System.out.println(i);
    }
    public int maxSubArray(int[] nums) {
        if(nums.length==0)return 0;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>0){
                nums[i]+=nums[i-1];

            }else{
                nums[i]=nums[i];
            }
            max=Math.max(nums[i],max);
        }
        return max;
    }
}
