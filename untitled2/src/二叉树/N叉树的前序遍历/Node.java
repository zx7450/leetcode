package 二叉树.N叉树的前序遍历;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Node {
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
//    public List<Integer> preorder(Node root) {//递归法
//        List<Integer> ans=new ArrayList<Integer>();
//        if (root==null)
//            return ans;
//        preord(root,ans);
//        return ans;
//    }
//    public void preord(Node root,List<Integer> ans) {
//        if (root==null)
//            return;
//        ans.add(root.val);
//        for (int i = 0; i < root.children.size(); i++) {
//            preord(root.children.get(i),ans);
//        }
//        return;
//    }
    public List<Integer> preorder(Node root) {//迭代法
        List<Integer> ans=new ArrayList<Integer>();
        if (root==null)
            return ans;
        Stack<Node> nodes=new Stack<Node>();
        nodes.push(root);
        while (!nodes.isEmpty()){
            Node node=nodes.pop();
            ans.add(node.val);
            for (int i = node.children.size()-1; i >= 0; i--) {
                nodes.push(node.children.get(i));
            }
        }
        return ans;
    }
}
