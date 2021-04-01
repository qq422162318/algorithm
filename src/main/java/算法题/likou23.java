package 算法题;
/*
合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。

示例:

输入:
[
  1->4->5,
  1->3->4,
  2->6
]
输出: 1->1->2->3->4->4->5->6

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-k-sorted-lists
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class likou23 {
        public TwoListhebing.ListNode mergeKLists(TwoListhebing.ListNode[] lists) {
            if(lists == null || lists.length < 1){
                return null;
            }
            int len=lists.length-1;
            return domain(lists,0,len);
        }
        public TwoListhebing.ListNode domain(TwoListhebing.ListNode[] lists, int left, int right) {
            if(left>=right){
                return lists[right];
            }
            int mid=(right+left)/2;
            TwoListhebing.ListNode ll= domain(lists,left,mid);
            TwoListhebing.ListNode lr=domain(lists,mid+1,right);
            return merge(ll,lr);
        }
        public TwoListhebing.ListNode merge(TwoListhebing.ListNode l1, TwoListhebing.ListNode l2){
            if(l1 == null){
                return l2;
            }
            if(l2 == null){
                return l1;
            }
            TwoListhebing.ListNode tmp;
            if(l1.val > l2.val){
                tmp = l1;
                l1 = l2;
                l2 = tmp;
            }
            l1.next = merge(l1.next, l2);
            return l1;
        }


}


