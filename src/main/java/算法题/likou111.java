package 算法题;

import java.util.LinkedList;
import java.util.Queue;

public class likou111 {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static void main(String[] args) {
        likou111 likou = new likou111();
    }
    public int minDepth(TreeNode root) {
       if (root==null)return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int depth=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i <size ; i++) {
                TreeNode head = queue.poll();
                if (head.left==null&&head.right==null)return depth;
                if (head.left!=null)queue.offer(head.left);
                if (head.right!=null)queue.offer(head.right);
            }
            depth++;
        }
        return depth;
    }
}
