package 算法题.剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 二叉树层序遍历 {
    List searchElement(offer7.TreeNode root){
        LinkedList<offer7.TreeNode> stack = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        stack.offer(root);
        while(!stack.isEmpty()){
            offer7.TreeNode node=stack.poll();
            res.add(node.val);
            if (node.left!=null) stack.offer(node.left);
            if (node.right!=null) stack.offer(node.right);
        }
        return res;
    }
}
