package 算法学习计划.算法入门.第十天递归回溯.合并两个有序链表;

/**
 * @author zx
 * @date 2021/12/22 9:02
 */
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2==null)
            return list1;
        else if (list1==null)
            return list2;
        else if (list1.val<list2.val) {
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        } else {
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
    }

}
