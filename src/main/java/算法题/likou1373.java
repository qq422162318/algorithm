package 算法题;

import sun.reflect.generics.tree.Tree;

/**
 * 1373. 二叉搜索子树的最大键值和
 * 给你一棵以 root 为根的 二叉树 ，请你返回 任意 二叉搜索子树的最大键值和。
 * 二叉搜索树的定义如下：
 * 任意节点的左子树中的键值都 小于 此节点的键值。
 * 任意节点的右子树中的键值都 大于 此节点的键值。
 * 任意节点的左子树和右子树都是二叉搜索树。
 * 示例 1：
 * 输入：root = [1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]
 * 输出：20
 * 解释：键值为 3 的子树是和最大的二叉搜索树。
 * 示例 2：
 * 输入：root = [4,3,null,1,2]
 * 输出：2
 * 解释：键值为 2 的单节点子树是和最大的二叉搜索树。
 * 示例 3：
 * 输入：root = [-4,-2,-5]
 * 输出：0
 * 解释：所有节点键值都为负数，和最大的二叉搜索树为空。
 * 示例 4：
 * 输入：root = [2,1,3]
 * 输出：6
 * 示例 5：
 * 输入：root = [5,4,8,3,null,6,3]
 * 输出：7
 */
public class likou1373 {
    public static void main(String[] args) {
        likou1373 likou = new likou1373();
        TreeNode root = new TreeNode(1);
        TreeNode left = root.left = new TreeNode(4);
        left.left = new TreeNode(2);
        left.right = new TreeNode(4);
        TreeNode right = root.right = new TreeNode(3);
        right.left = new TreeNode(2);
        TreeNode ss = right.right = new TreeNode(5);
        ss.left = new TreeNode(4);
        ss.right = new TreeNode(6);
        System.out.println(likou.maxSumBST(root));
    }

    int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        traverse(root);
        return maxSum;
    }

    private int[] traverse(TreeNode root) { // base case
        if (root == null) return new int[]{
                1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0
        };

        int[] left = traverse(root.left);
        int[] right = traverse(root.right);

        int[] res = new int[4];
        if (left[0] == 1 && right[0] == 1 &&
                root.val > left[2] && root.val < right[1]) {
            res[0] = 1;
            res[1] = Math.min(left[1], root.val);
            res[2] = Math.max(right[2], root.val);
            res[3] = left[3] + right[3] + root.val;
            maxSum = Math.max(maxSum, res[3]);
        } else {
            res[0] = 0;
        }
        return res;
    }

    static class TreeNode {
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
