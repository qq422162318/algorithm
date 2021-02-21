package 算法题;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 18. 四数之和
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * 注意：
 * 答案中不可以包含重复的四元组。
 * 示例：
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 */
public class likou18 {
    public static void main(String[] args) {
//        int[] nums = {-4,-3,1, 0, -1,3,4, 0, -2, 2};
        int[] nums = {1, 0, -1, 0, -2, 2};
        Arrays.sort(nums);
        likou18 likou = new likou18();
//        List<List<Integer>> lists = likou.fourSum(nums, 0);
        List<List<Integer>> lists = likou.nSum(nums, 4,0,0);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer+"\t");
            }
            System.out.println();
        }
    }
    public List<List<Integer>> nSum(int[] nums, int n,int start,int target) {
//        Arrays.sort(nums);
        int sz = nums.length;
        List<List<Integer>> res=new ArrayList<>();
        if (n == 2) {
            // 双指针那一套操作
            int lo = start, hi = sz - 1;
            while (lo < hi) {
                int sum = nums[lo] + nums[hi];
                int left = nums[lo], right = nums[hi];
                if (sum < target) {
                    lo++;
                } else if (sum > target) {
                    hi--;
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[lo]);
                    temp.add(nums[hi]);
                    res.add(temp);
                    while (lo < hi && nums[lo] == left) lo++;
                    while (lo < hi && nums[hi] == right) hi--;
                }
            }
        } else {
            // n > 2 时，递归计算 (n-1)Sum 的结果
            for (int i = start; i < sz; i++) {
                List<List<Integer>> lists = nSum(nums, n-1,i + 1, target - nums[i]);
                for (List<Integer> list : lists) {
                    list.add(nums[i]);
                    res.add(list);
                }
                while (i<sz-1&&nums[i]==nums[i+1])i++;
            }
        }

        return res;
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<List<Integer>> lists = threeSum(nums, i + 1, target - nums[i]);
            for (List<Integer> list : lists) {
                list.add(nums[i]);
                res.add(list);
            }
            while (i<n-1&&nums[i]==nums[i+1])i++;
        }
        return res;
    }
    public List<List<Integer>> threeSum(int[] nums,int start,int target){

        int len = nums.length;
        List<List<Integer>> res=new ArrayList<>();
        for (int i = start; i < len; i++) {
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