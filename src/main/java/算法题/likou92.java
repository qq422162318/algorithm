package 算法题;
import java.util.List;
/**
 * 92. 反转链表 II
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 * 示例:
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 */
public class likou92 {
    public static void main(String[] args) {
        likou92 likou92 = new likou92();
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        for (int i = 2; i <6 ; i++) {
            while (listNode.next!=null){
                listNode=listNode.next;
            }
            listNode.next=new ListNode(i);
        }
        ListNode listNode1 = likou92.reverseBetween2(head, 2, 4);
//        ListNode listNode1 = likou92.reverse(head,4);
        while (listNode1.next!=null){
            System.out.print(listNode1.val+"->");
            listNode1=listNode1.next;
            if (listNode1.next==null){
                System.out.print(listNode1.val);
            }
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left==1){
            return reverse(head,right);
        }
        head.next=reverseBetween(head.next,left-1,right-1);

        return head;
    }
    public ListNode reverseBetween2(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode pre = dummy;
        for (int i = 1; i <left ; i++) {
            pre=pre.next;
        }
        head=pre.next;//下一个节点就是要遍历翻转的节点
        for (int i = left; i <right ; i++) {
            ListNode nex = head.next;
            head.next=nex.next;
            nex.next=pre.next;
            pre.next=nex;
        }
        return dummy.next;
    }
    ListNode lastest=null;
    ListNode reverse(ListNode head,int n){
        if (n==1) {
            lastest=head.next;
            return head;
        }
        ListNode last=reverse(head.next,n-1);
        head.next.next=head;//将下一个节点的next指针指向自己
        head.next=lastest;//将不翻转的节点指向自己
        return last;
    }
    ListNode reverse(ListNode head){
        if (head.next==null) {
            return head;
        }
        ListNode last=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
