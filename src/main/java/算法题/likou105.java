package 算法题;
/**
 * 105. 从前序与中序遍历序列构造二叉树
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * 注意:
 * 你可以假设树中没有重复的元素。
 * 例如，给出
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
import java.util.HashMap;
import java.util.Map;
public class likou105 {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  private static Map<Integer,Integer> indexMap;
    public static TreeNode buildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if(preorder_left>preorder_right)return null;
        int preorder_root=preorder_left;
        int inorder_root=indexMap.get(preorder[preorder_root]);
        TreeNode root=new TreeNode(preorder[preorder_root]);
        //中序遍历数组根节点位置减去起始位置等于共同的左子节点的长度
        int size_left_subtree=inorder_root-inorder_left;
        root.left=buildTree(preorder, inorder, preorder_left+1, preorder_left+size_left_subtree, inorder_left, inorder_root-1);
        root.right=buildTree(preorder,inorder,preorder_left+size_left_subtree+1,preorder_right,inorder_root+1,inorder_right);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        int n=preorder.length;
        indexMap=new HashMap<Integer, Integer>();
        for (int i = 0; i <n ; i++) {
            indexMap.put(inorder[i],i);
        }
        TreeNode treeNode = buildTree(preorder,inorder,0,n-1,0,n-1);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            map.put(inorder[i],i);
        }
        TreeNode treeNode2 = buildTree2(preorder,inorder,0,n-1,map,0,n-1);
        System.out.println(treeNode2.val);
    }

    private static TreeNode buildTree2(int[] preorder, int[] inorder, int preLeft, int preRight, HashMap<Integer, Integer> map,int inLeft, int inRight) {
        if (preLeft>preRight||inLeft>inRight)return null;
        int pIndex=map.get(preorder[preLeft]);
        TreeNode root = new TreeNode(preorder[preLeft]);
        root.left=buildTree2(preorder,inorder,preLeft+1,pIndex-inLeft+preLeft,map,inLeft,pIndex-1);
        root.right=buildTree2(preorder, inorder, pIndex-inLeft+preLeft+1, preRight, map, pIndex+1, inRight);
        return root;
    }
}
