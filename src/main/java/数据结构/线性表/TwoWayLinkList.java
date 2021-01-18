package 数据结构.线性表;

import java.util.Iterator;

public class TwoWayLinkList<T> implements Iterable<T>{
    private Node head;
    private Node last;

    private int N;

    private class Node{
        public T item;
        public Node pre;
        public Node next;

        public Node(T item, Node pre, Node next){
            this.item=item;
            this.pre=pre;
            this.next=next;
        }
    }
    public TwoWayLinkList(){
     this.head=new Node(null,null,null);
     this.last=null;
     this.N=0;
    }
    public void clear(){
     this.head.next=null;
     this.head.pre=null;
     this.head.item=null;
     this.last=null;
     this.N=0;
    }
    public int length(){
     return N;
    }
    public boolean isEmpty(){
     return N==0;
    }
    public T getFirst(){
        if (isEmpty()){
            return null;
        }
        return head.next.item;
    }
    public T getLast(){
        if (isEmpty())return null;
        return last.item;
    }
    public void insert(T t){
     if (isEmpty()){
         Node newNode=new Node(t,head,null);
         last=newNode;
         head.next=last;
     }else{
         Node oldLast=last;
         Node newNode=new Node(t,oldLast,null);
         oldLast.next=newNode;
         last=newNode;
     }
     N++;
    }
    public void insert(int i,T t){
      Node pre=head;
      for (int index=0;index<i;index++){
          pre=pre.next;
      }
      Node curr=pre.next;
      Node newNode=new Node(t,pre,curr);
      pre.next=newNode;
      curr.pre=newNode;
      N++;
    }
    public T get(int i){
        Node n=head.next;
        for (int index = 0; index < i; index++) {
            n=n.next;
        }
        return n.item;
    }
    public int indexOf(T t){
        Node n=head;
        for (int i = 0; n.next!=null; i++) {
            n=n.next;
            if (n.next.equals(t)){
                return i;
            }
        }
        return -1;
    }
    public T remove(int i){
     Node pre=head;
     //找到前一个节点
        for (int index = 0; index < i; index++) {
            pre=pre.next;
        }
        Node curr = pre.next;
        Node nextNode=curr.next;
        pre.next=nextNode;
        nextNode.pre=pre;
        N--;
        return curr.item;
    }
    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }
    private class TIterator implements Iterator{
      private Node n;
      public TIterator(){
          this.n=head;
      }
        @Override
        public boolean hasNext() {

            return n.next!=null;
        }

        @Override
        public Object next() {
          n=n.next;
            return null;
        }
    }
    public void reverse(){
        if (isEmpty()){
            return ;
        }
        reverse(head.next);
    }
    public Node reverse(Node curr){
        //出口
        if (curr.next==null){
            head.next=curr;
            return curr;
        }
        Node pre=reverse(curr.next);
        pre.next=curr;

        curr.next=null;
        return curr;
    }
}
