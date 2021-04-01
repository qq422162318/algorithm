package 算法题;
/**
 * 450. 删除二叉搜索树中的节点
 * 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。
 * 一般来说，删除节点可分为两个步骤：
 * 首先找到需要删除的节点；
 * 如果找到了，删除它。
 * 说明： 要求算法时间复杂度为 O(h)，h 为树的高度。
 * 示例:
 * root = [5,3,6,2,4,null,7]
 * key = 3
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 * 给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。
 * 一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。
 *     5
 *    / \
 *   4   6
 *  /     \
 * 2       7
 * 另一个正确答案是 [5,2,6,null,4,null,7]。
 *     5
 *    / \
 *   2   6
 *    \   \
 *     4   7
 */
public class likou450 {
    public static void main(String[] args) {

    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null)return null;
        if (root.val==key){
            // 这两个 if 把情况 1 和 2 都正确处理了
            if (root.left==null)return root.right;
            if (root.right==null)return root.left;
            //必须找到左子树中最大的那个节点，或者右子树中最小的那个节点来接替自己
            TreeNode minNode=getMin(root.right);
            root.val=minNode.val;
            root.right=deleteNode(root.right,minNode.val);
        }else if (root.val>key){
            root.left=deleteNode(root.left, key);
        }else if (root.val<key){
            root.right=deleteNode(root.right,key);
        }
        return root;
    }

    private TreeNode getMin(TreeNode root) {
//        if (root==null)return null;
//        TreeNode min = getMin(root.left);
//        if (root.val<min.val)return root;
//        return min;
        while(root.left!=null)root=root.left;
        return root;
    }

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
}
