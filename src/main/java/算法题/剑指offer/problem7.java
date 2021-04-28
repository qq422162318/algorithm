package 算法题.剑指offer;

import java.util.HashMap;

/**
 * 剑指 Offer 07. 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如，给出
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 限制：
 * 0 <= 节点个数 <= 5000
 */
public class problem7 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int[] pre = null, in = null;
    HashMap<Integer, Integer> mapIndex = null;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;
        pre = preorder;
        in = inorder;
        int root = 0, left = 0, right = preorder.length - 1;
        mapIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            mapIndex.put(inorder[i], i);
        }
        TreeNode build = build(root, left, right);
        return build;
    }

    private TreeNode build(int root, int left, int right) {

        if (root>pre.length-1||left<0||right<0)return null;
        int inIndex = mapIndex.get(pre[root]);
        TreeNode node = new TreeNode(pre[root]);
        node.left = build(root + 1, left, inIndex-1);
        node.right = build(root+inIndex-left+1, inIndex+1, right);
        return node;
    }
}
