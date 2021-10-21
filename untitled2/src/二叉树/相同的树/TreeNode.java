package 二叉树.相同的树;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {//Quiz100
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
//    public boolean isSameTree(TreeNode p, TreeNode q) {//递归法
//        if (p==null&&q==null) return true;
//        else if (p!=null&&q==null) return false;
//        else if (p==null&&q!=null) return false;
//        else if (p.val!= q.val) return false;
//        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
//    }
    public boolean isSameTree(TreeNode p, TreeNode q) {//迭代法
        Queue<TreeNode> treeNodes=new LinkedList<TreeNode>();
        treeNodes.add(p);
        treeNodes.add(q);
        while (!treeNodes.isEmpty()){
            TreeNode node1=treeNodes.poll();
            TreeNode node2=treeNodes.poll();
            if (node1==null&&node2==null) continue;
            else if ((node1!=null&&node2==null)||(node1==null&&node2!=null)) return false;
            else if (node1.val!= node2.val) return false;
            treeNodes.add(node1.left);
            treeNodes.add(node2.left);
            treeNodes.add(node1.right);
            treeNodes.add(node2.right);
        }
        return true;
    }
}
