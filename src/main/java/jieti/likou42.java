package jieti;

import java.util.Stack;

/**
 * 42. 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 *
 *s
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 感谢 Marcos 贡献此图。
 *
 * 示例:
 *
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 */
public class likou42 {
    public static void main(String[] args) {
        int[] num={0,1,0,2,1,0,1,3,2,1,2,1};
        int result=trap2(num);
        System.out.println("result+++++++:"+result);
    }
    public static int trap1(int[] height){
        int res = 0;
        // 遍历每个柱子
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = 0, rightMax = 0;
            // 计算当前柱子左侧的柱子中的最大高度
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            // 计算当前柱子右侧的柱子中的最大高度
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            // 结果中累加当前柱子顶部可以储水的高度，
            // 即 当前柱子左右两边最大高度的较小者 - 当前柱子的高度。
            res += Math.min(leftMax, rightMax) - height[i];
        }
        return res;
    }
    public static int trap2(int[] nums){
        int ans=0,leftIndex=0,rightIndex=nums.length-1;
        int leftMax=0,rightMax=0;
        while(leftIndex<=rightIndex){
            if(leftMax<=rightMax){
                leftMax=Math.max(leftMax,nums[leftIndex]);
                ans+=leftMax-nums[leftIndex];
                leftIndex++;
            }else{
                rightMax=Math.max(rightMax, nums[rightIndex]);
                ans+=rightMax-nums[rightIndex];
                rightIndex--;
            }
        }
        return ans;
    }
    public static int trap(int[] nums){
        if(nums.length==0)return 0;
        Stack<Integer> stack=new Stack<>();
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            while(!stack.isEmpty()&&nums[stack.peek()]<nums[i]){
                int curIdx=stack.pop();
                // 如果栈顶元素一直相等，那么全都pop出去，只留第一个。
                while(!stack.isEmpty()&&nums[stack.peek()]==nums[curIdx]){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    // stack.peek()是此次接住的雨水的左边界的位置，右边界是当前的柱体，即i。
                    // Math.min(height[stack.peek()], height[i]) 是左右柱子高度的min，减去height[bottomIdx]就是雨水的高度。
                    // i - stack.peek() - 1 是雨水的宽度。
                    int statckTop=stack.peek();
                    int min=Math.min(nums[statckTop], nums[i])-nums[curIdx];

                    ans+=min *(i-statckTop-1);
                }
            }
            stack.push(i);
        }

        return ans;
    }
}
