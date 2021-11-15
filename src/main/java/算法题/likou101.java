package 算法题;

/**
 * 101. 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 */
public class likou101 {
    public static void main(String[] args) {
        likou101 likou101 = new likou101();
        TreeNode root = new TreeNode(1);
        TreeNode left = root.left = new TreeNode(2);
        TreeNode right = root.right = new TreeNode(2);
        left.left = new TreeNode(3);
        left.right = new TreeNode(4);
        right.left = new TreeNode(4);
        right.right = new TreeNode(3);
        System.out.println(likou101.isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode p) {
        return check(p.left, p.right);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val == right.val) {
            return check(left.left, right.right) && check(left.right, right.left);
        }
        return false;
    }

    public static class TreeNode {
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
