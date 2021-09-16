package 算法题;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 148. 排序链表
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 * 进阶：
 * 你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？
 * 示例 1：
 * 输入：head = [4,2,1,3]
 * 输出：[1,2,3,4]
 * 示例 2：
 * 输入：head = [-1,5,3,4,0]
 * 输出：[-1,0,3,4,5]
 * 示例 3：
 * 输入：head = []
 * 输出：[]
 * 提示：
 * 链表中节点的数目在范围 [0, 5 * 104] 内
 * -105 <= Node.val <= 105
 */
public class likou148 {
    public static void main(String[] args) {
        likou148 likou148 = new likou148();
        ListNode listNode = new ListNode();
        System.out.println(likou148.sortList(listNode).val);
    }

    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head.next.next, l, r;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        r = mergeSort(slow.next);
        slow.next = null;
        l = mergeSort(head);
        return mergeList(l, r);
    }

    private ListNode mergeList(ListNode l, ListNode r) {
        ListNode node = new ListNode(-1);
        ListNode t = node;
        while (l != null && r != null) {
            if (l.val < r.val) {
                t.next = l;
                l = l.next;
            } else {
                t.next = r;
                r = r.next;
            }
            t = t.next;
        }
        t.next = (l == null) ? r : l;
        return node.next;
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
