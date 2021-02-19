package 算法题;
import java.util.HashMap;
import java.util.Map;
/**
 * 337. 打家劫舍 III
 * 在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
 * 计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。
 * 示例 1:
 * 输入: [3,2,3,null,3,null,1]
 *      3
 *     / \
 *    2   3
 *     \   \
 *      3   1
 * 输出: 7
 * 解释: 小偷一晚能够盗取的最高金额 = 3 + 3 + 1 = 7.
 * 示例 2:
 * 输入: [3,4,5,1,3,null,1]
 *
 *      3
 *     / \
 *    4   5
 *   / \   \
 *  1   3   1
 *
 * 输出: 9
 * 解释: 小偷一晚能够盗取的最高金额 = 4 + 5 = 9.
 */
public class likou337 {
    public static void main(String[] args) {
        likou337 likou337 = new likou337();
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        treeNode.left=t4;treeNode.right=t5;treeNode.right.right=treeNode1;treeNode.left.left=treeNode2;treeNode.left.right=t3;
        System.out.println(likou337.rob2(treeNode));
    }
    Map<TreeNode,Integer> memo=new HashMap<>();
    public int rob(TreeNode root) {
        if (root==null)return 0;
        if (memo.containsKey(root))return memo.get(root);
        // 抢，然后去下下家
        int do_it=root.val+(root.left==null?0:rob(root.left.left)+rob(root.left.right))+
                           (root.right==null?0:rob(root.right.left)+rob(root.right.right));
        // 不抢，然后去下家
        int not_do=rob(root.left)+rob(root.right);
        int res=Math.max(do_it,not_do);
        memo.put(root,res);
        return res;
    }
    public int rob2(TreeNode root){
        int[] res=dp(root);
        return Math.max(res[0],res[1]);
    }
    private int[] dp(TreeNode root) {
        if (root==null)return new int[]{0,0};
        int[] left=dp(root.left);
        int[] right=dp(root.right);
        int rob=root.val+left[0]+right[0];
        int not_robb=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return new int[]{not_robb,rob};
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
