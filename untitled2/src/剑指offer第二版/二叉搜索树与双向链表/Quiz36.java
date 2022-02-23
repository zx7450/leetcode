package 剑指offer第二版.二叉搜索树与双向链表;

import java.util.Stack;

/**
 * @author zx
 * @date 2022/2/23 9:55
 */
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

public class Quiz36 {
    Node pre,head;
    public Node treeToDoublyList(Node root) {
        if (root==null) return null;
        dfs(root);
        pre.right=head;
        head.left=pre;
        return head;
    }
    public void dfs(Node node) {
        if (node==null) return;
        dfs(node.left);
        if (pre!=null) pre.right=node;
        else head=node;
        node.left=pre;
        pre=node;
        dfs(node.right);
    }
}
