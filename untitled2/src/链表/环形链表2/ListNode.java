package 链表.环形链表2;

import java.util.HashSet;

/**
 * @author zx
 * @date 2021/10/11 0:24
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
    public ListNode detectCycle(ListNode head) {
        if (head==null)
            return null;
        else if (head.next==null)
            return null;
        else if (head.next==head)
            return head;
        ListNode slow=head;//slow指针每次移动一个结点
        ListNode fast=head;//fast指针每次移动两个结点
        ListNode findpos=null;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){//若快慢指针相遇，则设置两个指针分别从头结点和相遇结点每次移动一位，相遇结点即为答案
                ListNode index1=head;
                ListNode index2=fast;
                while (index1!=index2){
                    index1=index1.next;
                    index2=index2.next;
                }
                return index1;
            }
        }
        return null;//退出循环表示存在空指针，则不可能为环形链表
    }
}

