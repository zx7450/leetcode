package 链表.两两交换链表中的节点;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode swapPairs(ListNode head) {
        if (head==null)
            return head;
        else if (head.next==null)
            return head;
        ListNode temp=new ListNode(0,head);
        ListNode pre=temp;
        ListNode now=head;
        ListNode tail=head.next;
        ListNode nex;
        head=tail;
        while (true){
            nex=tail.next;
            pre.next=tail;
            now.next=nex;
            tail.next=now;
            pre=now;
            now=now.next;
            if (now==null)
                break;
            tail=now.next;
            if (tail==null)
                break;
        }
        return head;
    }
}
