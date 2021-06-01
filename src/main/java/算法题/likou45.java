package 算法题;

/**
 * 45. 跳跃游戏 II
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * 示例:
 * 输入: [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 * 从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * 说明:
 * 假设你总是可以到达数组的最后一个位置。
 */
public class likou45 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        likou45 likou45 = new likou45();
        int findlargefoot = likou45.jummp(nums);
        System.out.println(findlargefoot);
    }

    public int jummp(int[] nums) {
        int n = nums.length, end = 0, far = 0, steps = 0;
        for (int i = 0; i < n-1; i++) {
            far=Math.max(nums[i]+i,far);
            if (end==i){
                steps++;
                end=far;
            }
        }
        return steps;
    }

    int[] memo;
    public int jummp2(int[] nums) {
        int n = nums.length;
        memo = new int[n];
        Arrays.fill(memo,n);
        return dp(nums, 0);
    }
    private int dp(int[] nums, int p) {
        int n = nums.length;
        if (p >= n - 1) return 0;
        if (memo[p] != n) return memo[p];
        int steps = nums[p];
        for (int i = 1; i <= steps; i++) {
            int subProblem=dp(nums, p+i);
            memo[p]=Math.min(memo[p],subProblem+1);
        }
        return memo[p];
    }
}
