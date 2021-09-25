package 算法题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 90. 子集 II
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 * 示例 1：
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
 * 示例 2：
 * 输入：nums = [0]
 * 输出：[[],[0]]
 */
public class likou90 {
    public static void main(String[] args) {
        likou90 likou = new likou90();
        int[] nums = new int[]{4, 4, 4, 1, 4};
        List<List<Integer>> lists = likou.subsetsWithDup(nums);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer + ",");
            }
            System.out.print("///");
        }
    }

    List<List<Integer>> list;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<String> set = new HashSet<>();
        set.add("");
        int index = 0;
        list = new ArrayList<>();
        list.add(new ArrayList<>());
        trackback(set, "", index, nums);
        return list;
    }

    private void trackback(HashSet<String> set, String ss, int index, int[] nums) {
        if (!set.contains(ss)) {
            set.add(ss);
            ArrayList<Integer> tp = new ArrayList<>();
            String[] split = ss.split(",");
            for (String s : split)
                tp.add(Integer.valueOf(s));
            list.add(tp);
        }
        for (int i = index; i < nums.length; i++) {
            trackback(set, ss + String.valueOf(nums[i]) + ",", i + 1, nums);
        }
    }
}
