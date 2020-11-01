package 算法.树;

public class RedBlackTreeTest {
    public static void main(String[] args) {
        RedBlackTree<String,String> tree=new RedBlackTree<>();
        tree.put("1","张三");
        tree.put("2","李四");
        tree.put("3","王五");
        String r1=tree.get("1");
        System.out.println(r1);
        String r2=tree.get("2");
        System.out.println(r2);
        String r3=tree.get("3");
        System.out.println(r3);
    }
}
