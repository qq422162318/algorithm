package 算法题;
/**
 * 222. 完全二叉树的节点个数 给你一棵 完全二叉树 的根节点 root ，
 * 求出该树的节点个数。完全二叉树的定义如下：在完全二叉树中，
 * 除了最底层节点可能没填满外，其余每层节点数都达到最大值，
 * 并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，
 * 则该层包含 1~ 2h 个节点。 示例 1： 输入：root =[1,2,3,4,5,6] 输出：6 
 * 示例 2： 输入：root = [] 输出：0 
 * 示例 3： 输入：root = [1] 输出：1 
 * 提示：
 * 树中节点的数目范围是[0, 5 * 104] 0 <= Node.val <= 5 * 104
 * 题目数据保证输入的树是 完全二叉树
 */
public class likou222 {
    public static void main(String[] args) {
        
    }

    public int countNodes(TreeNode root) {
        TreeNode l = root, r = root;
        // 记录左、右子树的高度
        int hl = 0, hr = 0;
        while (l != null) {
            l = l.left;
            hl++;
        }
        while (r != null) {
            r = r.right;
            hr++;
        }
        // 如果左右子树的高度相同，则是一棵满二叉树
        if (hl == hr) {
            return (int) Math.pow(2, hl) -1;
        }
        // 如果左右高度不同，则按照普通二叉树的逻辑计算
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}