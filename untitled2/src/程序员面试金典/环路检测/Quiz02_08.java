package 程序员面试金典.环路检测;

/**
 * @author zx
 * @date 2022/4/11 9:42
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Quiz02_08 {
    public ListNode detectCycle(ListNode head) {
        if (head==null||head.next==null)
            return null;
        else if (head.next==head)
            return head;
        ListNode fast=head,slow=head;
        while (fast.next!=null&&fast.next.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow) {
                ListNode startfromhead=head;
                while (startfromhead!=fast) {
                    startfromhead=startfromhead.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return null;//退出循环表示链表尾部为空，不可能是环形链表
    }
}
