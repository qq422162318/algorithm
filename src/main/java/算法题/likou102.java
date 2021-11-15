package 算法题;

import org.omg.CORBA.INTERNAL;
import 算法题.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层序遍历结果：
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */
public class likou102 {
    public static void main(String[] args) {
        likou101 likou101 = new likou101();
        TreeNode root = new TreeNode(3);
        TreeNode left = root.left = new TreeNode(9);
        TreeNode right = root.right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        likou102 likou102 = new likou102();
        likou102.levelOrder(root);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int n = deque.size();
            ArrayList<Integer> temp = new ArrayList<>();
            while (n > 0) {
                TreeNode node = deque.poll();
                temp.add(node.val);
                list.add(temp);
                if (node.left != null) deque.offer(node.left);
                if (node.right != null) deque.offer(node.right);
                n--;
            }
        }
        return list;
    }

    int n = 0;

    private void check(TreeNode root) {
        if (root.left == null && root.right == null) return;
        if (root.left != null && root.right != null) {
            n++;
            check(root.left);
            check(root.right);
            return;
        }
        if (root.left == null && root.right != null) {
            n++;
            check(root.right);
        }
        if (root.left != null && root.right == null) {
            n++;
            check(root.left);
        }
    }


}
