package jieti;
/**
 * 61. 旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * 示例 1:
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 */
public class likou61 {
    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        //ListNode n6=new ListNode(null);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        //n5.next=n6;
        ListNode n=n1;
        System.out.print("原来：");
        while(n!=null){
            System.out.print(n.val+"=>");
            n=n.next;
        }
        System.out.println();
        ListNode listNode = rotateRight(n1, 2);
        while(listNode!=null){
            System.out.print(listNode.val+"=>");
            listNode=listNode.next;

        }
    }
    public static ListNode rotateRight(ListNode head,int k){
       if(head==null||k==0||head.next==null)return head;
       ListNode old_tail=head;
       int n;
        for (n=1; old_tail.next!=null ; n++) {
            old_tail=old_tail.next;
        }
        old_tail.next=head;

        ListNode new_tail=head;
        for (int i = 0; i <n-k%n-1 ; i++) {
            new_tail=new_tail.next;
        }
        ListNode new_head=new_tail.next;
        new_tail.next=null;
        return new_head;
    }
    public static class ListNode{
        Integer val;
        ListNode next;
        public ListNode(Integer val){
            this.val=val;
        }
    }
}
