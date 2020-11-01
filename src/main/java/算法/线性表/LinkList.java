package 算法.线性表;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T> {
    public Node head;
    private int N;

    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkList() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    public void clear() {
        this.head.next = null;
        this.N = 0;
    }

    public int length() {
        return N;
    }

    public boolean isEmpty() {
        if (N==0){
            return true;
        }
        else{
            return false;
        }
    }

    public T get(int i) {
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }

    public void insert(T t) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        Node newNode = new Node(t, null);
        n.next = newNode;
        N++;
    }

    public void insert(int i, T t) {
        Node pre = head;
        for (int index = 0; index <= i - 1; index++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        Node newNode = new Node(t, curr);
        pre.next = newNode;
        N++;
    }

    public T remove(int i) {
        Node pre = head;
        for (int index = 0; index <= i - 1; index++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        Node nextNode = curr.next;
        pre.next = nextNode;
        N--;
        return curr.item;
    }

    public int indexOf(T t) {
        Node n = head;
        for (int i = 0; n.next != null; i++) {
            n = n.next;
            if (n.item.equals(t)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }
    private class LIterator implements Iterator{
     private LinkList.Node n;
     public LIterator(){
         this.n=head;
     }
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }
    //用来反转整个链表
    public void reverse(){
    if (isEmpty()){
        return;
    }
    reverse(head.next);
    }
    //反转指定节点，并把结果返回
    public Node reverse(Node curr){
     if (curr.next==null){
      head.next=curr;
         return curr;
     }
     //递归的反转当前节点curr的下一个节点:返回值就是链表当前节点的下一个节点
        Node pre=reverse(curr.next);
        //让返回值的当前节点变为下一节点
        pre.next=curr;
        //把当前节点的下一个节点变为null
        curr.next=null;
        return curr;
    }
}