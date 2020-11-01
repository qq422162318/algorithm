package 算法.树;

import 算法.栈.Queue;

public class BinaryTreeTest {
    public static void main(String[] args) {
     BinaryTree<String, String> tree=new BinaryTree<>();
//     tree.put(1,"张三");
//     tree.put(2,"李四");
//     tree.put(3,"王五");
//        System.out.println("插入完毕后的元素个数为"+tree.size());
//        tree.delete(3);
//        System.out.println("2wei"+tree.get(2));
//        System.out.println("插入完毕后的元素个数为"+tree.size());
//        System.out.println("插入完毕后的元素个数为"+tree.get(3));
        tree.put("E","5");
        tree.put("B","2");
        tree.put("G","7");
        tree.put("A","1");
        tree.put("D","4");
        tree.put("F","6");
        tree.put("H","8");
        tree.put("C","3");
        Queue<String> keys=tree.layerErgodic();
        int maxDepth=tree.maxDepth();
        System.out.println(maxDepth);
        /*for (Object key:keys){
            String value=tree.get((String) key);
            System.out.println(key+"----"+value);
        }*/
    }
}
