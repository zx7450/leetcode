package 剑指offer第二版.合并两个排序的链表;

/**
 * @author zx
 * @date 2022/2/9 16:50
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Quiz25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null)
            return l2;
        else if (l2==null)
            return l1;
        else if (l1.val< l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
