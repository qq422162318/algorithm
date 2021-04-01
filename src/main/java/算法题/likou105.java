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
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 */

import java.util.HashMap;
import java.util.Map;

public class likou105 {
    private static Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart>preEnd)return null;
        int rootVal=preorder[preStart];
        int index=0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i]==rootVal){
                index=i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        root.left=build(preorder, preStart+1, index-inStart+preStart, inorder, inStart, index-1);
        root.right=build(preorder, index-inStart+preStart+1, preEnd, inorder, index+1, inEnd);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        int n = preorder.length;
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        TreeNode treeNode2 = buildTree2(preorder, inorder, 0, n - 1, map, 0, n - 1);
//        System.out.println(treeNode2.val);
        likou105 likou105 = new likou105();
        TreeNode build = likou105.buildTree(preorder,inorder);
        System.out.println(build);

    }

    private static TreeNode buildTree2(int[] preorder, int[] inorder, int preLeft, int preRight, HashMap<Integer, Integer> map, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) return null;
        int pIndex = map.get(preorder[preLeft]);
        TreeNode root = new TreeNode(preorder[preLeft]);
        root.left = buildTree2(preorder, inorder, preLeft + 1, pIndex - inLeft + preLeft, map, inLeft, pIndex - 1);
        root.right = buildTree2(preorder, inorder, pIndex - inLeft + preLeft + 1, preRight, map, pIndex + 1, inRight);
        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
