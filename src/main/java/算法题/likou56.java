package 算法题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56. 合并区间
 * 给出一个区间的集合，请合并所有重叠的区间。
 * 示例 1:
 *
 * 输入: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 *
 * 输入: intervals = [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 */
public class likou56 {
    public static void main( String[] args) {
         likou56 likou56 = new likou56();
         int[][] nums={{1,3},{2,6},{8,10},{15,18}};
         int[][] merge = likou56.merge2(nums);
        for ( int[] ints : merge) {
            for ( int i : ints) {
                System.out.print(i+"\t");
            }
        }
        System.out.println();
    }
    public int[][] merge( int[][] nums){
        Arrays.sort(nums,(v1,v2)->v1[0]-v2[0]);
        int[][] res=new int[nums.length][2];
        int index=-1;
        for (int[] num:nums) {
            if (index==-1||num[0]>res[index][1]){
                res[++index]=num;
            }else{
                res[index][1]=Math.max(res[index][1],num[1]);
            }
        }
        return Arrays.copyOf(res,index+1);
    }
    public int[][] merge2(int[][] arr){
        if(arr==null||arr.length<=1)return arr;
        List<int[]> list=new ArrayList<>();
        Arrays.sort(arr,new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
        });
        int i=0;
        int n=arr.length;
        while(i<n){
            int left=arr[i][0];
            int right=arr[i][1];
            while(i<n-1&&right>=arr[i+1][0]){
                right=Math.max(right, arr[i+1][1]);
                i++;
            }
            list.add(new int[]{left,right});
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }
}
