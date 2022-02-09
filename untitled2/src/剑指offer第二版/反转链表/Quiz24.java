package 剑指offer第二版.反转链表;

/**
 * @author zx
 * @date 2022/2/9 16:43
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Quiz24 {
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null)
            return head;
        ListNode pre=null,curr=head,nextNode=null;
        while (curr!=null) {
            nextNode=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nextNode;
        }
        return pre;
    }
}
