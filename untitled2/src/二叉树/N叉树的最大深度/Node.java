package 二叉树.N叉树的最大深度;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {//Quiz559
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
//    public int maxDepth(Node root) {//递归法
//        if (root==null) return 0;
//        int chilsize=root.children.size();
//        if (chilsize==0)
//            return 1;
//        int maxdepth=0;
//        for (int i = 0; i < root.children.size(); i++) {
//            int childrendept=maxDepth(root.children.get(i))+1;
//            maxdepth=childrendept>maxdepth?childrendept:maxdepth;
//        }
//        return maxdepth;
//    }
    public int maxDepth(Node root) {//层序遍历法
        if (root==null)
            return 0;
        Queue<Node> nodes=new LinkedList<Node>();
        nodes.add(root);
        int maxdept=0;
        while (!nodes.isEmpty()){
            int size=nodes.size();
            maxdept++;
            for (int i = 0; i < size; i++) {
                Node node=nodes.poll();
                for (int i1 = 0; i1 < node.children.size(); i1++) {
                    nodes.add(node.children.get(i1));
                }
            }
        }
        return maxdept;
    }
}
