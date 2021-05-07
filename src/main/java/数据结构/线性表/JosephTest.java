package 数据结构.线性表;

public class JosephTest {
    public static void main(String[] args) {

        //用来记录首节点
        Node<Integer> first=null;
        //用来记录前一个节点
        Node<Integer> pre=null;
        int count=0;
        for (int i = 0; 1 <=41 ; i++) {
            //如果是第一个节点
            if (i==1){
                first=new Node<>(i,null);
                pre=first;
                continue;
            }
            //如果不是第一个节点
            Node<Integer> newNode=new Node<>(i,null);
            pre.next=newNode;
            pre=newNode;
           //如果是最后一个节点,那么需要让最后一个结点的下一个节点变为first,变为循环链表
            if (i==41){
                pre.next=first;
            }
        }
       //2.需要count计数器,模拟报数

        //3.遍历循环链表
//       Node<Integer> n;
//        n = first;
//        Node<Integer> before=null;
//       while(n==n.next){
//         //模拟报数
//         count++;
//         //判断当前报数是不是为3
//         if (count==3) {
//             //如果是3,则把当前节点删除调用,打印当前节点,重制count
//             before.next=n.next;
//             System.out.println(n.item+",");
//             count=0;
//             n=n.next;
//         }else{
//            before=n;
//            n=n.next;
//         }
//       }
       //打印最后一个元素
        //System.out.println(n.item);
    }

    //节点类
    private static class Node<T> {
        T item;
        Node next;
        private Node(T item, Node next){
            this.item=item;
            this.next=next;
        }
    }
}
