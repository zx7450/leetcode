package 链表.合并k个升序链表;

import java.util.PriorityQueue;

/**
 * @author zx
 * @date 2024/1/2 9:46
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

class Status implements Comparable<Status> {
    ListNode node;

    public Status(ListNode node) {
        this.node = node;
    }

    public ListNode getNode() {
        return node;
    }

    public void setNode(ListNode node) {
        this.node = node;
    }

    @Override
    public int compareTo(Status o) {
        return this.node.val - o.node.val;
    }
}

public class Quiz23 {
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Status> listNodePriorityQueue = new PriorityQueue<>();
        for (ListNode list : lists) {
            if (list != null) listNodePriorityQueue.add(new Status(list));
        }
        ListNode ans = new ListNode(0), curr = ans;
        while (!listNodePriorityQueue.isEmpty()) {
            ListNode node = listNodePriorityQueue.poll().getNode();
            curr.next = node;
            curr = curr.next;
            if (node.next != null) listNodePriorityQueue.add(new Status(node.next));
        }
        return ans.next;
    }

    public static void main(String[] args) {
        System.out.println(mergeKLists(new ListNode[0]));
    }
}
