package 链表.删除排序链表中的重复元素;

/**
 * @author zx
 * @date 2024/1/2 17:08
 */
class ListNode {
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
}

public class Quiz83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode l = head, r = head.next;
        while (r != null) {
            while (r != null && l.val == r.val) {
                r = r.next;
            }
            l.next = r;
            l = l.next;
            if (r != null) r = r.next;
        }
        return head;
    }
}
