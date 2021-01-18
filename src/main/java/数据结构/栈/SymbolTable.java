package 数据结构.栈;

public class SymbolTable<Key,Value> {
    private Node head;
    private int N;
    private class Node{
        public Key key;
        public Value value;
        public Node next;
        public Node(Key key,Value value,Node next){
            this.key=key;
            this.value=value;
            this.next=next;
        }
    }
    public SymbolTable(){
        this.head=new Node(null,null,null);
    this.N=0;
    }
    public int size(){
        return N;
    }
    //往符号表中插入键值对
    public void put(Key key,Value value){
     //符号表中已经存在了键为key的键值对,那么只需要找到该节点,替换为value即可
     Node n=head;
     while(n.next!=null){
         //变换n
         n=n.next;
         //如果匹配替换value值
         if (n.key.equals(key)){
             n.value=value;
             return;
         }
     }
     //如果符号中没有该key,只需要创建新的节点,在保存插入链表头部
        Node newNode=new Node(key,value,null);
     Node oldFirst=head.next;
     newNode.next=oldFirst;
     head.next=newNode;
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
