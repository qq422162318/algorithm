package 数据结构.线性表;

public class CircleListCheckTest {
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

//        String mid=getMid(frist);
        boolean cicle=getMid(frist);
        System.out.println("是否有换："+cicle);

    }
    public static boolean getMid(Node<String> first){
        Node<String> fast=first;
        Node<String> slow=first;
        while (fast!=null&&fast.next!=null){
            //变换ｆａｓｔ的值和ｓｌｏｗ的值
            fast=fast.next.next;
            slow=slow.next;
            if (fast.equals(slow)){
                return true;
            }
        }
        return false;
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
