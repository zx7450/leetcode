package 链表.移除链表元素;

import 链表类.ListNode;

public class Quiz203 {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        if (head == null) return null;
        ListNode curr = head.next, pre = head;
        while (curr != null) {
            while (curr != null && curr.val == val)
                curr = curr.next;
            pre.next = curr;
            pre = curr;
            if (curr != null)
                curr = curr.next;
        }
        return head;
    }
}
