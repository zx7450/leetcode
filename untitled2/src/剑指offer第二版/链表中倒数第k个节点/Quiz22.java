package 剑指offer第二版.链表中倒数第k个节点;

/**
 * @author zx
 * @date 2022/2/8 16:07
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Quiz22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow=head,fast=head;
        while (fast.next!=null) {
            fast=fast.next;
            if (k>1)
                k--;
            else
                slow=slow.next;
        }
        return slow;
    }
}
