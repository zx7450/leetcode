package 算法学习计划.算法基础.第七天深度优先广度优先.填充每个节点的下一个右侧节点指针2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2022/1/5 9:59
 */

class Node {
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
}
public class Quiz117 {
    public Node connect(Node root) {//层次遍历
        if (root==null||(root.left==null&&root.right==null))
            return root;
        Queue<Node> nodeQueue=new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            int size=nodeQueue.size();
            Node pre=null;
            for (int i = 0; i < size; i++) {
                Node node= nodeQueue.poll();
                if (i!=0)
                    pre.next=node;
                if (node.left!=null)
                    nodeQueue.add(node.left);
                if (node.right!=null)
                    nodeQueue.add(node.right);
                pre=node;
            }
        }
        return root;
    }
}
