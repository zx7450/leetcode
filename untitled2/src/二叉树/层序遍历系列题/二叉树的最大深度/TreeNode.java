package 二叉树.层序遍历系列题.二叉树的最大深度;

import java.util.*;

public class TreeNode {//Quiz104
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
//    public int maxDepth(TreeNode root) {//层序遍历模板法
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
//                if (node.left!=null)
//                    treeNodes.add(node.left);
//                if (node.right!=null)
//                    treeNodes.add(node.right);
//            }
//        }
//        return dept;
//    }
    public int maxDepth(TreeNode root) {//深度优先法(最优)
        if (root==null)
            return 0;
        int leftdepth=maxDepth(root.left)+1;
        int rightdepth=maxDepth(root.right)+1;
        return leftdepth>rightdepth?leftdepth:rightdepth;
    }
}
