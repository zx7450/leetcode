package 剑指offer第二版.删除链表中的节点;

/**
 * @author zx
 * @date 2022/2/7 18:17
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Quiz18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val==val) return head.next;
        ListNode preNode=head;
        ListNode currNode=head.next;
        while (currNode.val!=val) {
            preNode=currNode;
            currNode=currNode.next;
        }
        preNode.next=currNode.next;
        return head;
    }
}
