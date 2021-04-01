package 算法题;

public class likou234 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        for (int i = 2; i <= 6; i++) {
            while (listNode.next != null) {
                listNode = listNode.next;
            }
            listNode.next = new ListNode(i);
        }
        likou234 likou234 = new likou234();
        System.out.println(likou234.isPalindrome2(head));
//        ListNode listNode1=likou234.reverse(head);
//        while (listNode1.next!=null){
//            System.out.print(listNode1.val+"->");
//            listNode1=listNode1.next;
//            if (listNode1.next==null){
//                System.out.print(listNode1.val);
//            }
//        }
    }

    ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return traverse(head);
    }
    public boolean isPalindrome2(ListNode head) {
        ListNode slow,fast;
        slow=fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if (fast!=null)slow=slow.next;
        ListNode l=head;
        ListNode r=reverse(slow);
        while (r!=null){
            if (l.val!=r.val)return false;
            l=l.next;
            r=r.next;
        }
        return true;
    }
    private boolean traverse(ListNode right) {
        if (right == null) return true;
        boolean res = traverse(right.next);
        res = res && (right.val == left.val);
        left = left.next;
        return res;
    }
    ListNode reverse(ListNode head) {
        ListNode pre = null, curr = head, nex = null;
        while (curr != null) {
            nex = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nex;
        }
        return pre;
    }

    static class ListNode {
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
