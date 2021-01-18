package 算法题;
/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * 示例 1:
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 */
public class likou34 {
    public static void main(String[] args) {
        //int[] arr={5,7,7,8,8,10};
        int[] arr={1};
        int[] ints = serachRange(arr,1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    public static int[] serachRange(int[] nums,int target){
        int left=0,right=nums.length-1;

        while (left<=right){
            int mid=left+(right-left)/2;
            if (target>nums[mid]){
                left=mid+1;
            }else if (target<nums[mid]){
                right=mid-1;
            }else{
                while(nums[left]!=target)left++;
                while (nums[right]!=target)right--;
                return new int[]{left,right};
            }
        }
        return new int[]{-1,1};
//        int[] ints = new int[2];
//        if (nums.length==0){
//            ints[0]=-1;
//            ints[1]=-1;
//            return ints;
//        }
//        ints[0]=findFist(nums,nums.length,target);
//        ints[1]=findEnd(nums,nums.length,target);
        //return ints;
    }
    public static int findFist(int[] nums,int len,int target){
        if (len<1){
            return -1;
        }
        int low=0;
        int high=len-1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (nums[mid]==target)return mid;
            else if (nums[mid]>=target){ high=mid-1; }
            else {low=mid+1;}
        }
        return -1;
    }
    public static int findEnd(int[] nums,int len,int target){
        if (len<1){ return -1; }
        int low=0;
        int high=len-1;
        int num = 0;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (nums[mid]==target){
                //while (nums[])
            }
            if (nums[mid]<=target){
                low=mid+1;
            } else high=mid-1;
        }
        return -1;
    }
}
