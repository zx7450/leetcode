package 链表.环形链表;

import 链表类.ListNode;

/**
 * @author zx
 * @date 2024/2/6 23:29
 */
public class Quiz141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                break;
        }
        if (fast == null || fast.next == null)
            return false;
        return true;
    }
}
