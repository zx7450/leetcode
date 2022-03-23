package 程序员面试金典.移除重复节点;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2022/3/23 9:31
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Quiz02_01 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head==null||head.next==null)
            return head;
        Set<Integer> hasoccur=new HashSet<>();
        ListNode pre=head,curr=head.next;
        hasoccur.add(pre.val);
        while (curr!=null) {
            if (!hasoccur.contains(curr.val)) {
                hasoccur.add(curr.val);
                pre=curr;
                curr=curr.next;
            } else {
                curr=curr.next;
                pre.next=curr;
            }
        }
        return head;
    }
}
