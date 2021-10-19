package 二叉树.层序遍历系列题.填充每个节点的下一个右侧节点指针;

import 二叉树.层序遍历系列题.层序遍历.TreeNode;

import java.util.*;

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
    public Node connect(Node root) {//还有空间复杂度为o(1)的更优解，见官方答案
        if (root==null)
            return root;
        Queue<Node> treeNodes=new LinkedList<Node>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            int size=treeNodes.size();
            for (int i = 0; i < size; i++) {
                Node node=treeNodes.poll();
                if (i<size-1)
                    node.next=treeNodes.peek();
                else
                    node.next=null;
                if (i==size-1)
                    node.next=null;
                if (node.left!=null)
                    treeNodes.add(node.left);
                if (node.right!=null)
                    treeNodes.add(node.right);
            }
        }
        return root;
    }
}
