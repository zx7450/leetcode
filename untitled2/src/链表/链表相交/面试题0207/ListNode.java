package 链表.链表相交.面试题0207;

/**
 * @author zx
 * @date 2021/10/10 23:58
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null)
            return null;
        int alen=0,blen=0;
        ListNode tempA=headA;
        while (tempA!=null){
            alen++;
            tempA=tempA.next;
        }
        ListNode tempB=headB;
        while (tempB!=null){
            blen++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if (alen>=blen)
            for (int i = 0; i < alen - blen; i++)
                tempA=tempA.next;
        else
            for (int i = 0; i < blen - alen; i++)
                tempB=tempB.next;
        while (tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
            if (tempA==null)
                break;
        }
        return tempA;
    }
}
