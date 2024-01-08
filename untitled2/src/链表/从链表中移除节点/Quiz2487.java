package 链表.从链表中移除节点;

import 链表类.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zx
 * @date 2024/1/3 8:55
 */


public class Quiz2487 {
    public ListNode removeNodes(ListNode head) {
        if (head.next == null) return head;
        Deque<ListNode> listNodes = new ArrayDeque<>();
        listNodes.addFirst(head);
        ListNode currNode = head.next;
        while (currNode != null) {
            if (!listNodes.isEmpty() && currNode.val > listNodes.peek().val) {
                while (!listNodes.isEmpty() && currNode.val > listNodes.peek().val) {
                    listNodes.poll();
                }
                if (listNodes.isEmpty()) head = currNode;
                else listNodes.peek().next = currNode;
            }
            listNodes.addFirst(currNode);
            currNode = currNode.next;
        }
        return head;
    }
}
