package 数据结构.排序;

public class FastSlowTest {
    public static void main(String[] args) throws Exception{
        Node<String> frist=new Node<String>("aa",null);
        Node<String> second=new Node<String>("bb",null);
        Node<String> thrid=new Node<String>("cc",null);
        Node<String> fourth=new Node<String>("dd",null);
        Node<String> fifth=new Node<String>("ee",null);
        Node<String> sixth=new Node<String>("ff",null);
        Node<String> seventh=new Node<String>("gg",null);

        frist.next=second;
        second.next=thrid;
        thrid.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;

        String mid=getMid(frist);
        System.out.println("中间值为："+mid);

    }
    public static String getMid(Node<String> first){
        Node<String> fast=first;
        Node<String> slow=first;
        while (fast!=null&&fast.next!=null){
            //变换ｆａｓｔ的值和ｓｌｏｗ的值
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.item;
    }
    //节点类
    private static class Node<T> {
        T item;
        Node next;
     private Node(T item,Node next){
         this.item=item;
         this.next=next;
     }
    }
}
