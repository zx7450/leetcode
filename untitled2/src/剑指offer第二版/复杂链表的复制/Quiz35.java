package 剑指offer第二版.复杂链表的复制;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2022/2/23 9:38
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Quiz35 {
    Map<Node,Node> nodeMap=new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head==null)
            return null;
        if (!nodeMap.containsKey(head)) {
            Node newhead=new Node(head.val);
            nodeMap.put(head,newhead);
            newhead.next=copyRandomList(head.next);
            newhead.random=copyRandomList(head.random);
        }
        return nodeMap.get(head);
    }
}
