package 链表.两两交换链表中的节点;

import 链表类.ListNode;

/**
 * @author zx
 * @date 2024/2/6 21:51
 */
public class Quiz24 {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode cur = head, next = head.next, pre = null;
        head = next;
        while (cur != null && next != null) {
            ListNode thirdNode = next.next;
            next.next = cur;
            cur.next = thirdNode;
            if (pre != null)
                pre.next = next;
            pre = cur;
            cur = thirdNode;
            if (thirdNode != null)
                next = thirdNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 1; i < 4; i++) {
            ListNode node = new ListNode(i + 1);
            cur.next = node;
            cur = cur.next;
        }
        head = swapPairs(head);
        cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
