package 算法题;

import java.util.Stack;

/**
 * 75. 颜色分类
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 * 示例:
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 * 进阶：
 * 一个直观的解决方案是使用计数排序的两趟扫描算法。
 * 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
 * 你能想出一个仅使用常数空间的一趟扫描算法吗？
 */
public class likou75 {
    public static void main(String[] args) {
       int[] arr={2,0,2,1,1,0};
       int[] arr2={1,2,0};
       sortColors2(arr2);
        for (int i : arr2) {
            System.out.print(i+"\t");
        }
    }
    public static void sortColors(int[] nums){
        int len=nums.length;
        int zero=0,one=0,two=0;
        for (int i = 0; i <len ; i++) {
            if (nums[i]==0)zero++;
            else if (nums[i]==1)one++;
            else if (nums[i]==2)two++;
        }
        Stack<Integer> zero_stack = new Stack<>();
        Stack<Integer> one_stack = new Stack<>();
        Stack<Integer> two_stack = new Stack<>();
        if (zero>0)
        for (int i = 1; i <=zero ; i++) zero_stack.push(0);
        if (one>0)
        for (int i = 1; i <=one ; i++) one_stack.push(1);
        if (two>0)
        for (int i = 1; i <=two ; i++) two_stack.push(2);
        for (int i = 0; i <len ; i++) {
            if (!zero_stack.isEmpty()){
                nums[i]=zero_stack.pop();
                continue;
            }
            if (!one_stack.isEmpty()){
                nums[i]=one_stack.pop();
                continue;
            }
            if (!two_stack.isEmpty()){
                nums[i]=two_stack.pop();
                continue;
            }
        }
    }
    public static void sortColors2(int[] nums) {
        int len = nums.length;
        int left=0,curr=0,right=len-1;
        int temp;
        while(curr<=right){
            if (nums[curr]==0){
                temp=nums[left];
                nums[left++]=nums[curr];
                nums[curr++]=temp;
            }
            else if (nums[curr]==2){
                temp=nums[curr];
                nums[curr]=nums[right];
                nums[right--]=temp;
            }
            else curr++;
        }
    }
}
