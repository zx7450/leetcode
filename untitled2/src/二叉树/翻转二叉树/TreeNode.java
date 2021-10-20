package 二叉树.翻转二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {//Quiz226
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
//    public TreeNode invertTree(TreeNode root) {//递归法
//        if (root==null)
//            return root;
//        else if (root.left==null&&root.right==null)
//            return root;
//        invert(root);
//        return root;
//    }
//    public void invert(TreeNode root) {
//        if (root==null)
//            return;
//        TreeNode temp=root.left;
//        root.left=root.right;
//        root.right=temp;
//        invert(root.left);
//        invert(root.right);
//    }
    public TreeNode invertTree(TreeNode root) {//层序遍历法
        if (root==null)
            return root;
        else if (root.left==null&&root.right==null)
            return root;
        Queue<TreeNode> treeNodes=new LinkedList<TreeNode>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            int size=treeNodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node=treeNodes.poll();
                swapnode(node);
                if (node.left!=null) treeNodes.add(node.left);
                if (node.right!=null) treeNodes.add(node.right);
            }
        }
        return root;
    }
    public void swapnode(TreeNode node){
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
        return;
    }
}
