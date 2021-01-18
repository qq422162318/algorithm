package 算法题;
/**
 * 39. 组合总和
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 * 说明：
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 * 示例 1：
 * 输入：candidates = [2,3,6,7], target = 7,
 * 所求解集为：
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * 示例 2：
 * 输入：candidates = [2,3,5], target = 8,
 * 所求解集为：
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 * 提示：
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * candidate 中的每个元素都是独一无二的。
 * 1 <= target <= 500
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class likou39 {
    public static void main(String[] args) {
        List<List<Integer>> result=new ArrayList<>();
        int[] candidates={2,3,5};int target=8;
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        runfind(candidates,candidates.length-1,list,8,result);
        for (List<Integer> integers : result) {
            System.out.println(integers);

        }
    }
    public static void runfind(int[] nums,int rightIndex,List<Integer> list,int target,List<List<Integer>> result){
        if (nums.length==0)return ;
        for (int i = rightIndex; i >=0 ; i--) {
            if (nums[i]<target){
                list.add(nums[i]);
                runfind(nums,i,list,target-nums[i],result);
                list.remove(list.size()-1);
            }else if (nums[i]==target){
                list.add(nums[i]);
                result.add(new ArrayList<>(list));
                list.remove(list.size()-1);
            }
        }
    }

}
