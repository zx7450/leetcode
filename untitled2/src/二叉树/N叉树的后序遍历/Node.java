package 二叉树.N叉树的后序遍历;

import java.util.ArrayList;
import java.util.Collections;
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
//    public List<Integer> postorder(Node root) {//递归法
//        List<Integer> ans=new ArrayList<Integer>();
//        if (root==null)
//            return ans;
//        postord(root,ans);
//        return ans;
//    }
//    public void postord(Node root,List<Integer> ans){
//        if (root==null)
//            return;
//        for (int i = 0; i < root.children.size(); i++) {
//            postord(root.children.get(i), ans);
//        }
//        ans.add(root.val);
//        return;
//    }
//    public List<Integer> postorder(Node root) {//代码随想录后序模板迭代法
//        List<Integer> ans=new ArrayList<Integer>();
//        if (root==null)
//            return ans;
//        Stack<Node> nodes=new Stack<Node>();
//        nodes.push(root);
//        while (!nodes.isEmpty()){
//            Node node=nodes.pop();
//            if (node!=null){
//                nodes.push(node);
//                nodes.push(null);// 中节点访问过，但是还没有处理，加入空节点做为标记。
//                for (int i = node.children.size()-1; i >= 0; i--) {
//                    nodes.push(node.children.get(i));
//                }
//            } else {// 只有遇到空节点的时候，才将下一个节点放进结果集
//                node=nodes.pop();
//                ans.add(node.val);
//            }
//        }
//        return ans;
//    }
    public List<Integer> postorder(Node root) {//普通后序迭代法，中右左序列+反转
        List<Integer> ans=new ArrayList<Integer>();
        if (root==null)
            return ans;
        Stack<Node> nodes=new Stack<Node>();
        nodes.push(root);
        while (!nodes.isEmpty()){
            Node node=nodes.pop();
            ans.add(node.val);
            for (int i = 0; i < node.children.size(); i++) {
                nodes.push(node.children.get(i));
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
