package 程序员面试金典.回文链表;


import java.util.Stack;

/**
 * @author zx
 * @date 2022/4/11 9:05
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Quiz02_06 {
    public boolean isPalindrome(ListNode head) {
        if (head==null||head.next==null)
            return true;
        ListNode firstofhalfend=endoffirsthalf(head);
        ListNode secondofhalfstart=reverseList(firstofhalfend.next);
        ListNode firstNode=head,secondNode=secondofhalfstart;
        boolean res=true;
        while (res&&secondNode!=null) {
            if (firstNode.val!=secondNode.val)
                res=false;
            firstNode=firstNode.next;
            secondNode=secondNode.next;
        }
        firstofhalfend.next=reverseList(secondofhalfstart);
        return res;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null) {
            ListNode nextTemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextTemp;
        }
        return prev;
    }
    public ListNode endoffirsthalf(ListNode head) {
        ListNode fast=head,slow=head;
        while (fast.next!=null&&fast.next.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
