package 算法学习计划.算法入门.第五天双指针.删除链表的倒数第N个结点;

/**
 * @author zx
 * @date 2021/12/17 9:38
 */
public class ListNode {//Quiz19
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null) {
            head=null;
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode pre=head;
        while (fast!=null) {
            if (n>0)
                n--;
            else {
                pre=slow;
                slow = slow.next;
            }
            fast=fast.next;
        }
        if (slow==head)
            head=head.next;
        else
            pre.next=slow.next;
        return head;
    }
}
