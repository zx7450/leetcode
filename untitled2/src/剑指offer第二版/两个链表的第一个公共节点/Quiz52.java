package 剑指offer第二版.两个链表的第一个公共节点;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2022/3/3 10:28
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Quiz52 {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {//哈希表法
//        Set<ListNode> nodeSet = new HashSet<>();
//        while (headA != null) {
//            nodeSet.add(headA);
//            headA = headA.next;
//        }
//        while (headB != null) {
//            if (nodeSet.contains(headB))
//                break;
//            headB = headB.next;
//        }
//        return headB;
//    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {//双指针法
        ListNode pa=headA,pb=headB;
        while (pa!=pb) {
            pa=pa==null?headB:pa.next;
            pb=pb==null?headA:pb.next;
        }
        return pa;
    }
}

