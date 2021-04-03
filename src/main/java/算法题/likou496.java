package 算法题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * 496. 下一个更大元素 I
 * 给你两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。
 * 请你找出 nums1 中每个元素在 nums2 中的下一个比其大的值。
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。
 * 示例 1:
 * 输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * 输出: [-1,3,-1]
 * 解释:
 *     对于 num1 中的数字 4 ，你无法在第二个数组中找到下一个更大的数字，因此输出 -1 。
 *     对于 num1 中的数字 1 ，第二个数组中数字1右边的下一个较大数字是 3 。
 *     对于 num1 中的数字 2 ，第二个数组中没有下一个更大的数字，因此输出 -1 。
 * 示例 2:
 *
 * 输入: nums1 = [2,4], nums2 = [1,2,3,4].
 * 输出: [3,-1]
 * 解释:
 *     对于 num1 中的数字 2 ，第二个数组中的下一个较大数字是 3 。
 *     对于 num1 中的数字 4 ，第二个数组中没有下一个更大的数字，因此输出 -1 。
 * 提示：
 * 1 <= nums1.length <= nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 104
 * nums1和nums2中所有整数 互不相同
 * nums1 中的所有整数同样出现在 nums2 中 Solution
 * 进阶：你可以设计一个时间复杂度为 O(nums1.length + nums2.length) 的解决方案吗？
 */
public class likou496 {
    public static void main(String[] args) {
//        int[] nums1={1,3,5,2,4};
//        int[] nums2={6,5,4,3,2,1,7};
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        likou496 likou496 = new likou496();
        int[] x = likou496.nextGreaterElement2(nums1, nums2);
        for (int i : x) {
            System.out.println(i);
        }
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int index=0;
        ArrayList<Integer> objects = new ArrayList<>();
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums2[j]==nums1[i]) {
                    if (j + 1 < nums2.length&& nums2[j + 1] > nums1[i]) {
                        objects.add(nums2[j + 1]);
                    } else {
                        objects.add(-1);
                    }
                    break;
                }
            }
        }
        Integer[] integers = new Integer[objects.size()];
        Integer[] integers1 = objects.toArray(integers);
        int[] ints = new int[objects.size()];
        for (int i = 0; i < objects.size(); i++) {
            ints[i]=integers1[i];
        }
        return ints;
    }
    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();

        int length = nums1.length;
        int length1 = nums2.length;
        for (int i = length1-1; i >=0; i--) {
            while(!stack.isEmpty()&&stack.peek()<nums2[i]){
                stack.pop();
            }
            if (!stack.isEmpty())
            integerIntegerHashMap.put(nums2[i],stack.peek());
            stack.push(nums2[i]);
        }
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i]=integerIntegerHashMap.getOrDefault(nums1[i],-1);
        }
        return ints;
    }
}
