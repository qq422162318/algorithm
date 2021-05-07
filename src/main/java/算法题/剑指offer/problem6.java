package 算法题.剑指offer;

import java设计原则.里氏替换原则.Liskov;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * 限制：
 * 0 <= 链表长度 <= 10000
 */
public class problem6 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        problem6 problem6 = new problem6();
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(2);
        int[] ints = problem6.reversePrint(node);
        System.out.println(ints);
    }

    public ListNode reverse(ListNode head) {
        if (head.next == null) return head;
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    public int[] reversePrint(ListNode head) {
        ListNode pre = null, cur = head, nex=head;
        int length = 0;
//        pre=reverse(head);//用递归或者下面的
//        while (pre.next != null) length++;
        while(cur!=null){
            nex=cur.next;
            cur.next=pre;

            pre=cur;
            cur=nex;
            length++;
        }

        int[] in = new int[length];
        int index = 0;
        while (pre != null) {
            in[index++] = pre.val;
            pre = pre.next;
        }
        return in;
    }
}
