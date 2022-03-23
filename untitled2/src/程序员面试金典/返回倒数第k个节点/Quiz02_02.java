package 程序员面试金典.返回倒数第k个节点;

/**
 * @author zx
 * @date 2022/3/23 9:46
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Quiz02_02 {
    public int kthToLast(ListNode head, int k) {
        ListNode pre=head,curr=head;
        while (k-1>0) {
            curr=curr.next;
            k--;
        }
        while (curr.next!=null) {
            pre=pre.next;
            curr=curr.next;
        }
        return pre.val;
    }
}
