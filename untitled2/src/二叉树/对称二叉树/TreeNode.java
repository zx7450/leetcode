package 二叉树.对称二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {//Quiz101
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
//    public boolean isSymmetric(TreeNode root) {//递归法
//        if (root==null)
//            return true;
//        return Compare(root.left,root.right);
//    }
//    public boolean Compare(TreeNode left,TreeNode righ) {
//        if (left==null&&righ==null) return true;
//        else if (left==null&&righ!=null) return false;
//        else if (left!=null&&righ==null) return false;
//        else if (left.val!=righ.val) return false;
//        return Compare(left.left,righ.right)&&Compare(left.right,righ.left);
//    }
    public boolean isSymmetric(TreeNode root) {//迭代法
        if (root==null)
            return true;
        Queue<TreeNode> treeNodes=new LinkedList<TreeNode>();
        treeNodes.add(root.left);
        treeNodes.add(root.right);
        while (!treeNodes.isEmpty()){
            TreeNode left=treeNodes.poll();
            TreeNode righ=treeNodes.poll();
            if (left==null&&righ==null) continue;
            else if (left==null&&righ!=null) return false;
            else if (left!=null&&righ==null) return false;
            else if (left.val!= righ.val) return false;
            treeNodes.add(left.left);
            treeNodes.add(righ.right);
            treeNodes.add(left.right);
            treeNodes.add(righ.left);
        }
        return true;
    }
}
