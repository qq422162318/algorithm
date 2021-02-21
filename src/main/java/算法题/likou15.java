package 算法题;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 示例 1：
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 示例 2：
 * 输入：nums = []
 * 输出：[]
 * 示例 3：
 * 输入：nums = [0]
 * 输出：[]
 * 提示：
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */
public class likou15 {
    public static void main(String[] args) {
        int[] nums = {-1, 0,2, 1,-1, -4};
        likou15 likou = new likou15();
        List<List<Integer>> lists = likou.threeSum(nums);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer+"\t");
            }
            System.out.println();
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length,target=0;
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 0; i < len; i++) {
            List<List<Integer>> ress=twoSumTarget(nums,i+1,target-nums[i]);
            for (List<Integer> re : ress) {
                re.add(nums[i]);
                res.add(re);
            }
            while (i<len-1&&nums[i]==nums[i+1])i++;
        }
        return res;
    }
    public List<List<Integer>> twoSumTarget(int[] nums,int start,int target){
        int le=start,ri=nums.length-1;
        List<List<Integer>> res=new ArrayList<>();
        while(le<ri){
           int left=nums[le],right=nums[ri];
           int sum=left+right;
           if (sum<target){
               while(le<ri&&left==nums[le])le++;
           }else if (sum>target){
               while(le<ri&&right==nums[ri])ri--;
           }else if (sum==target){
               ArrayList<Integer> temp = new ArrayList<>();
               temp.add(nums[le]);
               temp.add(nums[ri]);
               res.add(temp);
               while(le<ri&&left==nums[le])le++;
               while(le<ri&&right==nums[ri])ri--;
           }
        }
        return res;
    }
}