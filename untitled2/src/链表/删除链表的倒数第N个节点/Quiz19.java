package 链表.删除链表的倒数第N个节点;

import 链表类.ListNode;

/**
 * @author zx
 * @date 2024/2/6 22:07
 */
public class Quiz19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;
        ListNode fast = head, slow = head, pre = head;
        while (fast != null) {
            fast = fast.next;
            if (n >= 0)
                n--;
            else {
                pre = slow;
                slow = slow.next;
            }
        }
        if (slow == head)
            return head.next;
        pre.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 1; i < 2; i++) {
            ListNode node = new ListNode(i + 1);
            cur.next = node;
            cur = cur.next;
        }
        head = removeNthFromEnd(head, 1);
        cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
