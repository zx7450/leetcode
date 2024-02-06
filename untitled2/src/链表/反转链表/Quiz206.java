package 链表.反转链表;

import 链表类.ListNode;

/**
 * @author zx
 * @date 2024/2/6 21:44
 */
public class Quiz206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
