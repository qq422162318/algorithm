package 算法题;

import java.util.HashMap;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 * 根据一棵树的中序遍历与后序遍历构造二叉树。
 * 注意:
 * 你可以假设树中没有重复的元素。
 * 例如，给出
 * 中序遍历 inorder = [9,3,15,20,7]
 * 后序遍历 postorder = [9,15,7,20,3]
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class likou106 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        int n=inorder.length;
        map = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            map.put(inorder[i],i);
        }
        TreeNode treeNode2 = buildTree2(inorder,postorder,0,n-1,0,n-1);
        System.out.println(treeNode2.val);
    }
    static HashMap<Integer, Integer> map;
    private static TreeNode buildTree2(int[] inorder, int[] postorder, int inLeft, int inRight, int poLeft, int poRight) {
        if (inLeft>inRight||poLeft>poRight)return null;
        int temp=postorder[poRight];
        int inRoot_index=map.get(temp);
        TreeNode root = new TreeNode(temp);
        int l_size=inRoot_index+poLeft-inLeft;
        root.right=buildTree2(inorder, postorder, inRoot_index+1, inRight,  poLeft+l_size, inRight-1);
        root.left=buildTree2(inorder, postorder, inLeft,inRoot_index-1 ,  poLeft, l_size-1);

        return root;
    }
}
