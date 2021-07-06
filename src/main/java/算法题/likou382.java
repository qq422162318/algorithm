package 算法题;

import java.util.Random;

/**
 * 382. 链表随机节点
 * 给定一个单链表，随机选择链表的一个节点，并返回相应的节点值。保证每个节点被选的概率一样。
 * <p>
 * 进阶:
 * 如果链表十分大且长度未知，如何解决这个问题？你能否使用常数级空间复杂度实现？
 * <p>
 * 示例:
 * <p>
 * // 初始化一个单链表 [1,2,3].
 * ListNode head = new ListNode(1);
 * head.next = new ListNode(2);
 * head.next.next = new ListNode(3);
 * Solution solution = new Solution(head);
 * <p>
 * // getRandom()方法应随机返回1,2,3中的一个，保证每个元素被返回的概率相等。
 * solution.getRandom();
 */
public class likou382 {
    public static void main(String[] args) {

    }

    public void Solution(ListNode head) {
        ListNode p = head;
        int index = getRandom();
        int[] res = new int[index];
        for (int i = 0; i < index; i++) {
            while (i < index && p != null) {
                res[i] = p.val;
                p = p.next;
            }
        }
        //int i=k;
        while (p != null) {
            int j = new Random().nextInt(index);
            if (j < index) {
                res[j] = p.val;
            }
        }
    }

    int n = 0;

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        Random r = new Random();
        int r_index = r.nextInt(++n);

        return r_index;
    }

    public int[] getRandom2(ListNode head, int k) {
        Random r = new Random();
        int[] res = new int[k];
        ListNode p = head;
        for (int i = 0; i < k && p != null; i++) {
            res[i] = p.val;
            p = p.next;
        }
        int i = k;
        
        while (p != null) {
            int j = r.nextInt(++i);
            if (j < k)
                res[j] = p.val;
            p = p.next;
        }
        return res;
    }

    public class ListNode {
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
