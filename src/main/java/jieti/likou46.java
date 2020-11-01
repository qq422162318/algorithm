package jieti;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 46. 全排列
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * 示例:
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 */
public class likou46 {
    public static void main(String[] args) {
      int[] nums={1,2,3};
        List<List<Integer>> permute = permute(nums);
        for (List<Integer> integers : permute) {
            System.out.println(integers);
        }
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> list=new ArrayList<>();
        int[] visited=new int[nums.length];
        backtrack(list,nums,new ArrayList<Integer>(),visited);
        return list;
    }
    public static void backtrack(List<List<Integer>> list,int[] nums,List<Integer> res,int[] visited){
     if (nums.length==0) return ;
     if (res.size()==nums.length){
         list.add(new ArrayList<>(res));
         return ;
     }
    for (int i = 0; i <nums.length ; i++) {
        if (visited[i]==1)continue;
        visited[i]=1;
        res.add(nums[i]);
        backtrack(list, nums, res, visited);
        visited[i]=0;
        res.remove(res.size()-1);

     }
    }
}
