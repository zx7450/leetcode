package 每日一题.n叉树的前序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zx
 * @date 2022/3/10 8:55
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class Quiz589 {
    List<Integer> ans;
//    public List<Integer> preorder(Node root) {//递归
//        ans=new ArrayList<>();
//        if (root!=null)
//            backtracing(root);
//        return ans;
//    }
//
//    public void backtracing(Node node) {
//        ans.add(node.val);
//        for (int i = 0; i < node.children.size(); i++) {
//            backtracing(node.children.get(i));
//        }
//    }
    public List<Integer> preorder(Node root) {//迭代法
        ans=new ArrayList<>();
        if (root==null)
            return ans;
        Stack<Node> nodeStack=new Stack<>();
        nodeStack.push(root);
        while (!nodeStack.isEmpty()) {
            Node node=nodeStack.pop();
            ans.add(node.val);
            for (int i = node.children.size()-1; i >= 0; i--) {
                nodeStack.push(node.children.get(i));
            }
        }
        return ans;
    }
}
