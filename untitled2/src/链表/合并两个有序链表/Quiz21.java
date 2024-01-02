package 链表.合并两个有序链表;

import java.util.List;

/**
 * @author zx
 * @date 2023/12/29 8:38
 */
class ListNode {
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

public class Quiz21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        else if (list2 == null) return list1;
        ListNode curr1 = list1, curr2 = list2;
        ListNode ans = new ListNode(0);
        ListNode currNode = ans;
        while (curr1 != null || curr2 != null) {
            if (curr1 == null) {
                currNode.next = curr2;
                break;
            } else if (curr2 == null) {
                currNode.next = curr1;
                break;
            }
            if (curr1.val > curr2.val) {
                currNode.next = curr2;
                curr2 = curr2.next;
            } else {
                currNode.next = curr1;
                curr1 = curr1.next;
            }
            currNode = currNode.next;
        }
        return ans.next;
    }
}
