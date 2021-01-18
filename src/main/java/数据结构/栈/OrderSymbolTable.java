package 数据结构.栈;

public class OrderSymbolTable<Key extends Comparable<Key>,Value> {
    private Node head;
    private int N;
    private class Node{
        public Key key;
        public Value value;
        public Node next;
        public Node(Key key, Value value, Node next){
            this.key=key;
            this.value=value;
            this.next=next;
        }
    }
    public OrderSymbolTable(){
        this.head=new Node(null,null,null);
        this.N=0;
    }
    public int size(){
        return N;
    }
    //往符号表中插入键值对
    public void put(Key key,Value value){
       //定义两个Node变量,分别记录当前节点和当前节点的上一个节点
        Node curr=head.next;
        Node pre=head;
        while(curr!=null&&key.compareTo(curr.key)>0){
            //变换当前节点和前一个节点即可
            pre=curr;//遍历到插入位置的前一个结点
            curr=curr.next;//遍历插入位置的后一个节点
        }
        if (curr!=null&&key.compareTo(curr.key)==0){
            curr.value=value;
            return;
        }
        Node newNode=new Node(key,value,curr);
        pre.next=newNode;
        N++;
    }
    //删除
    public void delete(Key key){
        Node n=head;

        while(n.next!=null){
            //判断n节点的下一个节点
            if (n.next.key.equals(key)){
                n.next=n.next.next;
                N--;
                return;
            }
            //变换n
            n=n.next;
        }
    }
    //获取对应的键值对
    public Value get(Key key){
        //找到键为key的节点
        Node n=head;
        while(n.next!=null){
            n=n.next;
            if (n.key.equals(key)){
                return n.value;
            }
        }
        return null;
    }
}
