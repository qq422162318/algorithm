package jieti;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 47. 全排列 II
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 * 示例:
 * 输入: [1,1,2]
 * 输出:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 */
public class likou47 {
    public static void main(String[] args) {
        int[] nums={3,3,0,3};
        List<List<Integer>> permute = permute(nums);
        for (List<Integer> integers : permute) {
            System.out.println(integers);
        }
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] flag=new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums,flag,list,result);
        return result;
    }
    public static void backtrack(int[] nums, boolean[] flag, List<Integer> list, List<List<Integer>> result){
        if (list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            if (i>0&&flag[i-1]==false&&nums[i]==nums[i-1]){
                continue;
            }
            if (flag[i]==false){
                flag[i]=true;
                list.add(nums[i]);
                backtrack(nums, flag, list, result);
                list.remove(list.size()-1);
                flag[i]=false;
            }
        }
    }
}
