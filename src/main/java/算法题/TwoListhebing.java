package 算法题;

public class TwoListhebing {
    private ListNode val;

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public static void main(String[] args) {
      ListNode l1=new ListNode(1,null);
      ListNode l2=new ListNode(1,null);
      l1.next=new ListNode(2,null);
      l1.next.next=new ListNode(4,null);
      l2.next=new ListNode(3,null);
      l2.next.next=new ListNode(4,null);
        mergeTwoLists(l1,l2);
    }

        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){return l2;}
        else if (l2==null){return l1;}
        else if (l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }



        }


}
