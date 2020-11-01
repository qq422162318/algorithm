package jieti;
/**
 * 41. 缺失的第一个正数
 * 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。
 * 示例 1:
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 * 输入: [7,8,9,11,12]
 * 输出: 1
 */
import java.util.Arrays;
import java.util.Stack;
public class likou41 {
    public static void main(String[] args) {
//        int[] nums={1,2,0};
        int[] nums={3,4,-1,1};
        Arrays.sort(nums);
        findmin1(nums);
        int findmin = findmin(nums);
        System.out.println(findmin);
//        for (int num : nums) {
//            System.out.println(num);
//        }
    }
    public static void findmin1(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int count=0;
        for(int i=1;;i++){
            for(int j=0;j<nums.length;j++){
                if (nums[j]==0)continue;
                if (i==nums[j])break;
                if(j+1<nums.length&&i!=nums[j]&&i<nums[j+1]){
                    stack.push(i);
                }
                if (j==nums.length-1&&i>nums[nums.length-1]){
                    stack.push(i);
                }
                if(!stack.isEmpty()){
                    break;
                }
            }
            if(!stack.isEmpty()){
                break;
            }
        }
        Integer peek = stack.peek();
        System.out.println(peek);
    }
    public static int findmin(int[] nums){
        int min=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(nums[i]==min){
                    min++;
                }else if(nums[i]<min){
                    continue;
                }else{
                    return min;
                }
            }
        }
        return min;
    }
}
