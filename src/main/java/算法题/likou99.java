package 算法题;

import java.util.HashMap;

public class likou99 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        // int[] roots={1,3, (Integer) null, (Integer) null, 2 };

        TreeNode root= new TreeNode(1);
        root.left=new TreeNode(3);
        root.left.right=new TreeNode(2);
        recoverTree(root);
        int temp=t.val;
        t.val=s.val;
        s.val=temp;
    }
    static TreeNode pre,t,s;
    public static void recoverTree(TreeNode root) {
        if(root==null)return ;
        recoverTree(root.left);
        if(pre!=null&&root.val<pre.val){
            s= (s==null)?pre:s;
            t=root;
        }
        pre=root;
        recoverTree(root.right);
    }
}