package 每日一题.删除排序链表中的重复元素2;

import 链表类.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * @author zx
 * @date 2024/1/15 9:42
 */
public class Quiz82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode l = newhead, m = head, r = head.next;
        while (m != null && r != null) {
            if (m.val == r.val) {
                int val = m.val;
                while (r != null && r.val == val) r = r.next;
                l.next = r;
                m = r;
                if (r != null) r = r.next;
            } else {
                l = l.next;
                m = m.next;
                r = r.next;
            }
        }
        return newhead.next;
    }
}
