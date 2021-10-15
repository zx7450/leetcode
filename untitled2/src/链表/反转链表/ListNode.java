package 链表.反转链表;

public class ListNode {

      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode reverseList(ListNode head) {
          if (head==null)
              return head;
          else if (head.next==null)
              return head;
          ListNode pre=null;
          ListNode now=head;
          ListNode nex;
          while (now!=null){
              nex=now.next;
              now.next=pre;
              pre=now;
              now=nex;
          }
          head=pre;
          return head;
    }
}
