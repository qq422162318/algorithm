package 算法题;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 95. 不同的二叉搜索树 II
 * 给你一个整数 n ，请你生成并返回所有由 n 个节点组成且节点值从 1 到 n 互不相同的不同 二叉搜索树 。可以按 任意顺序 返回答案。
 * 示例 1：
 * 输入：n = 3
 * 输出：[[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
 * 示例 2：
 * 输入：n = 1
 * 输出：[[1]]
 * 提示：1 <= n <= 8
 */
public class likou95 {
    public static void main(String[] args) {
        likou95 likou95 = new likou95();
        List<TreeNode> treeNodes = likou95.generateTrees(3);
        System.out.println(treeNodes);
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return null;
        return build(1, n);
    }

    private List<TreeNode> build(int start, int end) {
        List<TreeNode> alltrees = new LinkedList<>();
        if (start > end) {
            alltrees.add(null);
            return alltrees;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftSum = build(start, i - 1);
            List<TreeNode> rightSum = build(i + 1, end);
            for (TreeNode l : leftSum) {
                for (TreeNode r : rightSum) {
                    TreeNode node = new TreeNode(i);
                    node.left = l;
                    node.right = r;
                    alltrees.add(node);
                }
            }
        }
        return alltrees;
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
