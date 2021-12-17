package 算法学习计划.算法入门.第五天双指针.链表的中间结点;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zx
 * @date 2021/12/17 9:19
 */
public class ListNode {//Quiz876
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
//    public ListNode middleNode(ListNode head) {//数组法
//        List<ListNode> nodeList=new LinkedList<>();
//        ListNode currenNode=head;
//        while (currenNode!=null) {
//            nodeList.add(currenNode);
//            currenNode=currenNode.next;
//        }
//        return nodeList.get(nodeList.size()/2);
//    }

//    public ListNode middleNode(ListNode head) {//两次循环，一次遍历所有节点获得链表长度n,第二次得到第n/2个节点
//        ListNode currenNode=head;
//        int length=0;
//        while (currenNode!=null) {
//            length++;
//            currenNode=currenNode.next;
//        }
//        currenNode=head;
//        for (int i = 0; i < length / 2; i++) {
//            currenNode=currenNode.next;
//        }
//        return currenNode;
//    }

    public ListNode middleNode(ListNode head) {//快慢指针法，快指针每次走两步，慢指针每次走一步，则快指针遍历完成后慢指针所在位置即为所求
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
