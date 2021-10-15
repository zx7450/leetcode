package 链表.移除链表元素;

public class Quiz203 {

      public class ListNode {
          int val;
          ListNode next;

          ListNode() {
          }

          ListNode(int val) {
              this.val = val;
          }

          ListNode(int val, ListNode next) {
              this.val = val;
              this.next = next;
          }
      }
    public ListNode removeElements(ListNode head, int val) {
        while (head!=null&&head.val==val)//先保证头结点不等于val
            head=head.next;
        if (head==null)
            return head;
        ListNode pre=head;
        ListNode now=head.next;
        while (now!=null){
            if (now.val==val){
                pre.next=now.next;
                now=now.next;
                continue;
            }
            else{
                pre=now;
                now=now.next;
            }
        }
        return head;
    }
}
