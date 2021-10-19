package 二叉树.层序遍历系列题.二叉树的最小深度;

import java.util.*;

public class TreeNode {//Quiz111
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
//    public int minDepth(TreeNode root) {//层序遍历模板法
//        if (root==null)
//            return 0;
//        Queue<TreeNode> treeNodes=new LinkedList<TreeNode>();
//        treeNodes.add(root);
//        int dept=0;
//        while (!treeNodes.isEmpty()){
//            int size=treeNodes.size();
//            dept++;
//            for (int i = 0; i < size; i++) {
//                TreeNode node=treeNodes.poll();
//                if (node.left==null&&node.right==null)
//                    return dept;
//                if (node.left!=null)
//                    treeNodes.add(node.left);
//                if (node.right!=null)
//                    treeNodes.add(node.right);
//            }
//        }
//        return dept;
//    }
    public int minDepth(TreeNode root) {//深度优先法
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDepth(root.right), min_depth);
        }

        return min_depth + 1;
    }
}
