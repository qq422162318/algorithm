package 算法题;

/**
 * 86. 分隔链表
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 * 示例 1：
 * 输入：head = [1,4,3,2,5,2], x = 3
 * 输出：[1,2,2,4,3,5]
 * 示例 2：
 * 输入：head = [2,1], x = 2
 * 输出：[1,2]
 */
public class likou86 {
    public ListNode partition(ListNode head, int x) {
        if (head==null) return null;
        ListNode small=new ListNode();
        ListNode big=new ListNode();
        ListNode s=small,b=big,cur=head;
        while (cur!=null){
            if (cur.val<x) {
                s.next=cur;
                s=s.next;
            }
            if (cur.val>=x) {
                b.next=cur;
                b=b.next;
            }
            cur=cur.next;
        }
        s.next=big.next;
        b.next=null;
        return small.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
