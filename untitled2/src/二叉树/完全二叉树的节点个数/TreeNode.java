package 二叉树.完全二叉树的节点个数;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {//Quiz222
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
//    public int countNodes(TreeNode root) {//层序遍历法
//        if (root==null) return 0;
//        Queue<TreeNode> treeNodes=new LinkedList<TreeNode>();
//        treeNodes.add(root);
//        int ans=0;
//        while (!treeNodes.isEmpty()) {
//            int size=treeNodes.size();
//            int thislawercount=0;
//            for (int i = 0; i < size; i++) {
//                TreeNode node=treeNodes.poll();
//                ans++;
//                if (node.left!=null) treeNodes.add(node.left);
//                if (node.right!=null) treeNodes.add(node.right);
//            }
//        }
//        return ans;
//    }
//    public int countNodes(TreeNode root) {//递归法
//        if (root==null) return 0;
//        return countNodes(root.left)+countNodes(root.right)+1;
//    }
    public int countNodes(TreeNode root) {//针对完全二叉树的解法
        if (root==null) return 0;
        int leftdept=0;
        int rightdept=0;
        TreeNode leftnode=root.left;
        TreeNode rightnode=root.right;
        while (leftnode!=null){
            leftdept++;
            leftnode=leftnode.left;
        }
        while (rightnode!=null){
            rightdept++;
            rightnode=rightnode.right;
        }
        if (leftdept==rightdept)
            return (2<<leftdept)-1;
        else
            return countNodes(root.left)+countNodes(root.right)+1;
    }
}
