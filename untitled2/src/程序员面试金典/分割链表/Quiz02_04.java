package 程序员面试金典.分割链表;

/**
 * @author zx
 * @date 2022/3/23 10:04
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Quiz02_04 {
    public ListNode partition(ListNode head, int x) {
        ListNode smallhead=new ListNode(0);
        ListNode bighead=new ListNode(0);
        ListNode small=smallhead,big=bighead;
        while (head!=null) {
            if (head.val<x) {
                small.next=head;
                small=small.next;
            } else {
                big.next=head;
                big=big.next;
            }
            head=head.next;
        }
        small.next=bighead.next;
        big.next=null;
        return smallhead.next;
    }
}
