package 二叉树.层序遍历系列题.N叉树的层序遍历;

import java.util.*;

public class Node {//Quiz429
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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root==null)
            return ans;
        Queue<Node> treeNodes=new LinkedList<Node>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            int size=treeNodes.size();
            List<Integer> rowans=new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                Node node=treeNodes.poll();
                rowans.add(node.val);
                for (int i1 = 0; i1 < node.children.size(); i1++) {
                    treeNodes.add(node.children.get(i1));
                }
            }
            ans.add(rowans);
        }
        return ans;
    }
}
