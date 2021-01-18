package 算法题;

public class NodeList {
  private Node head;
  public class Node{
       Node item;
       Node next;
       private Node(Node item,Node next){
           this.item=item;
           this.next=next;
       }
  }
  public NodeList(Node node,Node item){
      head.next=node;
      head.item=item;
  }

}
