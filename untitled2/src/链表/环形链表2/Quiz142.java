package 链表.环形链表2;

import 链表类.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2024/2/6 23:02
 */
public class Quiz142 {
    //哈希表法
//    public ListNode detectCycle(ListNode head) {
//        Set<ListNode> nodeSet = new HashSet<>();
//        ListNode cur = head;
//        while (cur != null) {
//            if (nodeSet.contains(cur))
//                return cur;
//            nodeSet.add(cur);
//            cur = cur.next;
//        }
//        return null;
//    }
    //快慢指针法
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                break;
        }
        if (fast == null || fast.next == null)
            return null;
        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
