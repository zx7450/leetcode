package 链表.删除链表的倒数第N个节点;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode removeNthFromEnd(ListNode head, int n) {//双指针法，让右指针和左指针保持n的距离，让右指针移动到末尾左指针所在位置即为倒数第n个
        if (head.next==null){
            head=null;
            return head;
        }
        ListNode pre=null;
        ListNode left=head;//即为要删除的结点
        ListNode right=head.next;
        int dis=1;
        while (right!=null){
            if (dis!=n){
                dis++;
            } else {
                pre=left;
                left = left.next;
            }
            right=right.next;
        }
        if (pre==null)//说明未发生过移动，直接将head后移一位即可
            head=head.next;
        else
            pre.next=left.next;
        return head;
    }
}
