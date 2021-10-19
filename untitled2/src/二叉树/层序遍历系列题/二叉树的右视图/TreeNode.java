package 二叉树.层序遍历系列题.二叉树的右视图;

import java.util.*;

public class TreeNode {//Quiz199
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root==null)
            return ans;
        Queue<TreeNode> treeNodes=new LinkedList<TreeNode>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            int size=treeNodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node=treeNodes.poll();
                if (i==size-1)
                    ans.add(node.val);
                if (node.left!=null)
                    treeNodes.add(node.left);
                if (node.right!=null)
                    treeNodes.add(node.right);
            }
        }
        return ans;
    }
}
