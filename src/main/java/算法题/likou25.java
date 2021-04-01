package 算法题;
/**
 * 25. K 个一组翻转链表
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * 示例：
 * 给你这个链表：1->2->3->4->5
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 * 说明：
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 */
public class likou25 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        for (int i = 2; i <=6 ; i++) {
            while (listNode.next!=null){
                listNode=listNode.next;
            }
            listNode.next=new ListNode(i);
        }
        likou25 likou25 = new likou25();
        ListNode listNode1 = likou25.reverseKGroup2(head, 2);
//        ListNode listNode1 = likou25.reverse(head);
        while (listNode1.next!=null){
            System.out.print(listNode1.val+"->");
            listNode1=listNode1.next;
            if (listNode1.next==null){
                System.out.print(listNode1.val);
            }
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null)return null;
        ListNode a,b;
        a=b=head;
        for (int i = 0; i < k; i++) {
            if (b==null)return head;
            b=b.next;
        }
        ListNode newHead = reverse(a, b);
        a.next=reverseKGroup(b,k);
        return newHead;
    }
    public ListNode reverseKGroup2(ListNode head, int k) {
         ListNode curr=head;
         int count=0;
         while(curr!=null&&count!=k){
             curr=curr.next;
             count++;
         }
         if (count==k){
             curr=reverseKGroup2(curr,k);
             while(count-- >0){
                 ListNode temp = head.next;
                 head.next=curr;//将“直接”头预添加到反向列表
                 curr=head;//将反转部分的头移至新节点
                 head=temp;//将“直接”头移至直接部分中的下一个节点
             }
             head=curr;
         }
        return head;
    }
    ListNode reverse(ListNode a,ListNode b){
        ListNode pre,cur,nex;
        pre=null;cur=a;nex=null;
        while(cur!=b){
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        return pre;
    }
    ListNode reverse(ListNode head){
        ListNode pre,cur,nex;
        pre=null;cur=head;nex=null;
        while(cur!=null){
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        return pre;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
