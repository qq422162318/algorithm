package 算法题;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 239. 滑动窗口最大值
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回滑动窗口中的最大值。
 * 示例 1：
 * 输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
 * 输出：[3,3,5,5,6,7]
 * 解释：
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * 示例 2：
 * 输入：nums = [1], k = 1
 * 输出：[1]
 * 示例 3：
 * 输入：nums = [1,-1], k = 1
 * 输出：[1,-1]
 * 示例 4：
 * 输入：nums = [9,11], k = 2
 * 输出：[11]
 * 示例 5：
 * 输入：nums = [4,-2], k = 2
 * 输出：[4]
 * 提示：
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * 1 <= k <= nums.length
 */
public class likou239 {
    public static void main(String[] args) {
        likou239 likou239 = new likou239();
        int nums[]={1,3,-1,-3,5,3,6,7};
        int[] ints = likou239.maxSlidingWindow(nums, 3);
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        MonotonicQueue monotonicQueue = new MonotonicQueue();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i<k-1){
                monotonicQueue.push(nums[i]);
            }else{
                monotonicQueue.push(nums[i]);
                integers.add(monotonicQueue.max());
                monotonicQueue.pop(nums[i-k+1]);
            }
        }
        int[] ints = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            ints[i]=integers.get(i);
        }
        return ints;
    }
    class MonotonicQueue{
        private LinkedList<Integer> q=new LinkedList<>();
        public void push(int n){
            while(!q.isEmpty()&&q.getLast()<n){
                q.pollLast();
            }
            q.addLast(n);
        }
        public int max(){
            return q.isEmpty()?0:q.getFirst();
        }
        public void pop(int n){
            /**
             * threee situation
             */
            if (n==q.getFirst()){
                q.pollFirst();
            }
        }
    }
}
