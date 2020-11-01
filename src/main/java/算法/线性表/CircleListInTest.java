package 算法.线性表;

public class CircleListInTest {
    public static void main(String[] args) {
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
        seventh.next=thrid;
        //查找环的入口节点
        String entrance=getEnetrance(frist);
        System.out.println("first链表中环的入口节点元素为"+entrance);
    }
    public static String getEnetrance(Node<String> first){
        Node<String> fast=first;
        Node<String> slow=first;
        Node<String> temp=null;
        while (fast!=null&&fast.next!=null){
            //变换快慢指针
            fast=fast.next.next;
            slow=slow.next;
            if (fast.equals(slow)){
              temp=first;
              continue;
            }
            //临时节点变换
            if (temp!=null){
                temp=temp.next;
                //如果相遇了
                if (temp.equals(slow)){
                    break;
                }
            }
        }
        return slow.item;
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
