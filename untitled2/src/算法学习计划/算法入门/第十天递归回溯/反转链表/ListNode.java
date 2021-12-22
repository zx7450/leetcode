package 算法学习计划.算法入门.第十天递归回溯.反转链表;

/**
 * @author zx
 * @date 2021/12/22 9:18
 */
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

//    ListNode ans;
//    public ListNode reverseList(ListNode head) {//递归
//        if (head==null)
//            return head;
//        reverseNode(null,head);
//        return ans;
//    }
//
//    public void reverseNode(ListNode pre,ListNode curr) {
//        ListNode nextnode=curr.next;
//        curr.next=pre;
//        ans=curr;
//        if (nextnode==null)
//            return;
//        pre=curr;
//        curr=nextnode;
//        reverseNode(pre,curr);
//    }
    public ListNode reverseList(ListNode head) {//迭代
        if (head==null||head.next==null)
            return head;
        ListNode pre=null;
        while (head!=null) {
            ListNode nextnode=head.next;
            head.next=pre;
            pre=head;
            head=nextnode;
        }
        return pre;
    }
}
