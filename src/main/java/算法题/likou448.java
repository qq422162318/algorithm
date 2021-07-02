package 算法题;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 * 示例 1：
 * 输入：nums = [4,3,2,7,8,2,3,1]
 * 输出：[5,6]
 * 示例 2：
 * 输入：nums = [1,1]
 * 输出：[2]
 */
public class likou448 {
    public static void main(String[] args) {
        likou448 likou448 = new likou448();
        int[] a={4,3,2,7,8,2,3,1};
        System.out.println(likou448.missingNumber(a));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] ints = new int[nums.length + 1];
        for (int num : nums) {
            ints[num]++;
        }
        for (int i = 1; i < ints.length; i++) {
            if (ints[i]==0) list.add(i);
        }
        return list;
    }

    //解题思路：使用数组的下标来标记数字的出现于否，通过一遍遍历即可标记出全部已经出现的数组
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] = - nums[Math.abs(nums[i]) - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                results.add(i + 1);
            }
        }
        return results;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res=0;
        res+=n-0;
        for (int i = 0; i < n; i++) {
            res+=i-nums[i];
        }
        return res;
    }
    public int missingNumber2(int[] nums){
        int n = nums.length;
        int expect = (0 + n) * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return expect - sum;
    }
}
