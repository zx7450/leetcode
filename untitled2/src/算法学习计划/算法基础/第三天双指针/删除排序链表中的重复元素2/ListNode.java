package 算法学习计划.算法基础.第三天双指针.删除排序链表中的重复元素2;

/**
 * @author zx
 * @date 2021/12/29 9:45
 */
public class ListNode {//Quiz82
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

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null)
            return head;
        ListNode headofList=new ListNode();
        headofList.next=head;
        ListNode pre=headofList;
        ListNode currentnode=head;
        while (currentnode!=null&&currentnode.next!=null) {
            if (currentnode.val==currentnode.next.val){
                ListNode nextnode=currentnode.next.next;
                while (nextnode!=null&&nextnode.val==currentnode.val)
                    nextnode=nextnode.next;
                pre.next=nextnode;
            } else {
                pre = pre.next;
            }
            currentnode=pre.next;
        }
        return headofList.next;
    }
}
