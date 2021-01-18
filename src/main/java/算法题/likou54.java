package 算法题;
import java.util.LinkedList;
import java.util.List;
/**
 * 54. 螺旋矩阵
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 * 示例 1:
 * 输入:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * 示例 2:
 *
 * 输入:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class likou54 {
    public static void main(String[] args) {
       int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        likou54 likou54 = new likou54();
        List<Integer> integers = likou54.spiralOrder2(nums);
        for (Integer integer : integers) {
            System.out.print(integer);
        }
    }
//    public List<Integer> void spiralOrder(int[][] nums){
//        if (nums.length==0)return null;
//         List<Integer> list=new ArrayList<>();
//        for (int i = 0; i < nums[0].length; i++) {
//            int[] flag=new int[nums.length*nums.length];
//            for (int j = 0; j <nums[0].length ; j++) {
//                if (flag[nums.length-1]==1){
//
//                }
//                flag[i]=1;
//
//            }
//        }
//        return list;
//    }
    public List<Integer> spiralOrder2(int[][] nums){
        LinkedList<Integer> res=new LinkedList<>();
       int m=nums.length;
       if (m==0)return res;
       int n=nums[0].length;
       int up=0,down=m-1,left=0,right=n-1;
       while(true){
           //遍历最上面一层
           for (int i = left; i <=right ; i++)
               res.add(nums[up][i]);
           if (++up>down)break;
           //遍历最右边一层
           for (int i = up; i <=down ; i++)
               res.add(nums[i][right]);
           if (--right<left)break;
           //遍历最下面一层
           for (int i=right;i>=left;i--)
               res.add(nums[down][i]);
           if (--down<up)break;
           //遍历剩余的中间层
           for (int i =down; i >=up ; i--)
               res.add(nums[i][left]);
           if (++left>right)break;
       }
       return res;
    }
}
