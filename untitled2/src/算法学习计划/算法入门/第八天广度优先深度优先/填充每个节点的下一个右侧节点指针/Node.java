package 算法学习计划.算法入门.第八天广度优先深度优先.填充每个节点的下一个右侧节点指针;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2021/12/21 9:41
 */
public class Node {//Quiz116
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    public Node connect(Node root) {//层序遍历法
        if (root==null)
            return root;
        if (root.left==null&&root.right==null) {
            root.next=null;
            return root;
        }
        Queue<Node> nodeQueue=new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            int queuesize=nodeQueue.size();
            Node pre=null;
            for (int i = 0; i < queuesize; i++) {
                Node currNode=nodeQueue.poll();
                if (currNode.left!=null)
                    nodeQueue.add(currNode.left);
                if (currNode.right!=null)
                    nodeQueue.add(currNode.right);
                if (pre!=null)
                    pre.next=currNode;
                pre=currNode;
            }
            pre.next=null;
        }
        return root;
    }
}
