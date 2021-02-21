package 算法题;

import java.util.Arrays;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * 提示：
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 */
public class likou1 {
    public static void main(String[] args) {
        int[] num=new int[]{2,7,11,15};
        likou1 likou = new likou1();
        int[] ints = likou.twoSum(num, 9);
        for (int anInt : ints) {
            System.out.print(anInt+"\t");
        }
    }
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        int[] res=new int[right+1];
        int index=0;
        while(left<right){
            int num=nums[left]+nums[right];
            if (num<target){
                left++;
            }else if (num>target){
                right--;
            }else if (num==target){
                res[0]=left;
                res[1]=right;
                return res;
            }
        }
        return res;
    }
    public int[][] twoSum2(int[] nums, int target) {
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        int[][] res=new int[right+1][];
        int index=0;
        while(left<right){
            int le=nums[left],ri=nums[right];
            int num=nums[left]+nums[right];
            if (num<target){
//                while (left<right&&nums[left]==le)left++;
                left++;
            }else if (num>target){
//                while (left<right&&nums[right]==ri)right--;
                right--;
            }else if (num==target){
                res[index][0]=nums[left];
                res[index][1]=nums[right];
                while (left<right&&nums[left]==le)left++;
                while (left<right&&nums[right]==ri)right--;
                ++index;
            }
        }
        return Arrays.copyOf(res,index);
    }
}
