package 算法题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 57. 插入区间
 * 给出一个无重叠的 ，按照区间起始端点排序的区间列表。
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 * 示例 1：
 * 输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
 * 输出：[[1,5],[6,9]]
 * 示例 2：
 * 输入：intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * 输出：[[1,2],[3,10],[12,16]]
 * 解释：这是因为新的区间 [4,8] 与 [3,5],[6,7],[8,10] 重叠。
 */
public class likou57 {
    public static void main(String[] args) {
        likou57 likou57 = new likou57();
        int[][] nums={{1,3},{6,9}};int[] newnum={2,5};
        int[][] insert = likou57.insert(nums, newnum);
        for (int[] ints : insert) {
            System.out.println(Arrays.toString(ints));
        }
    }
    public int[][] insert(int[][] nums,int[] newInsert){
        List<int[]> temp=new ArrayList<>();
        int i=0;
        while (i<nums.length&&newInsert[0]>nums[i][1]){
            temp.add(nums[i]);
            i++;
        }
        int[] tmp=new int[]{newInsert[0],newInsert[1]};
        while(i<nums.length&&newInsert[1]>=nums[i][0]){
           tmp[0]=Math.min(tmp[0],nums[i][0]);
           tmp[1]=Math.max(tmp[1],nums[i][1]);
           i++;
        }
        temp.add(tmp);
        while(i<nums.length){
            temp.add(nums[i]);
            i++;
        }
       return temp.toArray(new int[0][]);
    }
}
