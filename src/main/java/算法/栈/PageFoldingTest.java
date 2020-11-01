package 算法.栈;

import java.awt.print.PrinterGraphics;

public class PageFoldingTest {
    public static void main(String[] args) {
     Node<String> tree=createTree(2);
     printTree(tree);
    }
    //通过模拟对折n次纸,产生树
    public static Node createTree(int N){
    //定义根节点
    Node<String> root=null;
        for (int i = 0; i < N; i++) {

            //1.当前为第一次对折
            if (i==0){
                root=new Node<>("down",null,null);
                continue;
            }
            //2.当前不是第一次对折
            Queue<Node> queue = new Queue<>();
            queue.enqueue(root);
            //循环遍历队列
            while(!queue.isEmpty()){
                //从队列中弹出一个节点
                Node<String> tmp = queue.dequeue();
               if (tmp.left!=null){
                   queue.enqueue(tmp.left);
               }
               if (tmp.right!=null){
                   queue.enqueue(tmp.right);
               }
               if (tmp.left==null&&tmp.right==null){
                   tmp.left=new Node("down",null,null);
                   tmp.right=new Node("up",null,null);
               }
            }
        }
     return root;
    }
    //打印树中每个节点到控制台
    public static void printTree(Node<String> root){
     if (root==null){
         return ;
     }
     if (root.left!=null){
         printTree(root.left);
     }
        System.out.print(root.item+" ");
     if (root.right!=null){
         printTree(root.right);
     }
    }
    public static class Node<T>{
        public T item;
        public Node left;
        public Node right;
        public Node(T item,Node left,Node right){
            this.item=item;
            this.left=left;
            this.right=right;
        }
    }
}
