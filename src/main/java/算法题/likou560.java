package 算法题;

import java.util.HashMap;

/**
 * 560. 和为K的子数组
 * 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 * 示例 1 :
 * 输入:nums = [1,1,1], k = 2
 * 输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
 * 说明 :
 * 数组的长度为 [1, 20,000]。
 * 数组中元素的范围是 [-1000, 1000] ，且整数 k 的范围是 [-1e7, 1e7]。
 */
public class likou560 {
    public static void main(String[] args) {
        likou560 likou560 = new likou560();
        int a[] = {1, 1, 1};
        System.out.println(likou560.subarraySum2(a, 2));
    }

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (sum[i] - sum[j] == k)
                    ans++;
            }
        }
        return ans;
    }

    public int subarraySum2(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int sum_i = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum_i = sum_i + nums[i];
            int j = sum_i - k;
            if (map.containsKey(j)) {
                ans += map.get(j);
            }
            map.put(sum_i, map.getOrDefault(sum_i, 0) + 1);
        }
        return ans;
    }
}
