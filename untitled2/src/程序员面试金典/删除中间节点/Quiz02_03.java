package 程序员面试金典.删除中间节点;

/**
 * @author zx
 * @date 2022/3/23 9:55
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Quiz02_03 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
