package 算法题;

/**
 * 81. 搜索旋转排序数组 II
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,0,1,2,2,5,6] 可能变为 [2,5,6,0,0,1,2] )。
 * 编写一个函数来判断给定的目标值是否存在于数组中。若存在返回 true，否则返回 false。
 * 示例 1:
 * 输入: nums = [2,5,6,0,0,1,2], target = 0
 * 输出: true
 * 示例 2:
 * 输入: nums = [2,5,6,0,0,1,2], target = 3
 * 输出: false
 * 进阶:
 * 这是 搜索旋转排序数组 的延伸题目，本题中的 nums  可能包含重复元素。
 * 这会影响到程序的时间复杂度吗？会有怎样的影响，为什么？
 */
public class likou81 {
    public static void main(String[] args) {
     int[] nums = {2,5,6,0,0,1,2};
        likou81 likou81 = new likou81();
        boolean search = likou81.search(nums, 2);
        System.out.println(search);
    }
    public boolean search(int[] nums, int target) {
        int l=0;
        int r = nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if (nums[mid]==target)return true;
            //如果左侧有序
            else if (nums[l]<nums[mid]){//如果左侧有序说明数组是取中间值想左旋转
               if (nums[l]<=target&&nums[mid]>target){//如果最左值比目标值小且中间值比目标值大说明目标值在左半部分
                   r=mid-1;
               }else l=mid+1;
            }
            //如果右侧有序
            else if (nums[r]>nums[mid]){//如果右侧有序说明数组是取中间值想右旋转
                if (nums[mid]<target&&nums[r]>=target){//如果中间值比目标值小且最右值比目标值大则说明目标值在右半部分
                    l=mid+1;
                }else r=mid-1;
            }
            //如果与mid值相等，两边向中间压缩
            else{
                while(l<=r&&nums[l]==nums[mid])l++;
                while(l<=r&&nums[r]==nums[mid])r--;
            }
        }
       return false;
    }
}
