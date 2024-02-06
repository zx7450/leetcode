package 链表.链表相交.面试题0207;

import 链表类.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/**
 * @author zx
 * @date 2024/2/6 22:39
 */
public class mst02_07 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        int alen = 0, blen = 0;
        ListNode cura = headA, curb = headB;
        while (cura != null) {
            alen++;
            cura = cura.next;
        }
        while (curb != null) {
            blen++;
            curb = curb.next;
        }
        cura = headA;
        curb = headB;
        while (cura != null && curb != null) {
            if (alen != blen) {
                if (alen > blen) {
                    cura = cura.next;
                    alen--;
                } else {
                    curb = curb.next;
                    blen--;
                }
            } else {
                if (cura == curb)
                    return cura;
                cura = cura.next;
                curb = curb.next;
            }
        }
        return null;
    }
}
