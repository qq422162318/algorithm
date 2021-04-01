package 算法题;

import java.util.*;

/**
 * 199. 二叉树的右视图
 * 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 *
 * 示例:
 *
 * 输入: [1,2,3,null,5,null,4]
 * 输出: [1, 3, 4]
 * 解释:
 *
 *    1            <---
 *  /   \
 * 2     3         <---
 *  \     \
 *   5     4       <---
 */
public class likou199 {
    public static void main(String[] args) {

    }
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    //深度优先遍历
    List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root){
        dfs(root,0);
        return res;
    }
    private void dfs(TreeNode root, int depth){
        if (root ==null)return;
        //如果当前节点所在深度还没有出现在res里，说明在该深度下当前节点是第一个被访问的节点，
        // 因此将当前节点加入res中
        if (depth==res.size()){
            res.add(root.val);
        }
        depth++;
        dfs(root.right,depth);
        dfs(root.left,depth);
    }
    //广度优先遍历
    public List<Integer> rightSideView1(TreeNode root){
        List<Integer> temp=new ArrayList<>();
        if (root==null)return temp;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i <size ; i++) {
                TreeNode node=queue.poll();
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
                if (i==size-1){
                    temp.add(node.val);
                }
            }
        }
        return temp;
    }
}
