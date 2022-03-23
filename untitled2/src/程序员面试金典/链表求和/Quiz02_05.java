package 程序员面试金典.链表求和;

/**
 * @author zx
 * @date 2022/3/23 13:04
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Quiz02_05 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode anshead = new ListNode(0);
        ListNode currnode = anshead;
        int plusflag = 0;
        while (l1 != null || l2 != null) {
            int currval;
            if (l1 == null) {
                currval = l2.val + plusflag;
                l2 = l2.next;
            } else if (l2 == null) {
                currval = l1.val + plusflag;
                l1 = l1.next;
            } else {
                currval = l1.val + l2.val + plusflag;
                l1 = l1.next;
                l2 = l2.next;
            }
            if (currval>=10) {
                currval-=10;
                plusflag=1;
            } else
                plusflag=0;
            currnode.next=new ListNode(currval);
            currnode=currnode.next;
        }
        if (plusflag==1)
            currnode.next=new ListNode(1);
        return anshead.next;
    }
}
