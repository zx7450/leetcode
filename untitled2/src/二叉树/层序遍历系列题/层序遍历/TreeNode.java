package 二叉树.层序遍历系列题.层序遍历;

import java.util.*;

public class TreeNode {//Quiz102
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root==null)
            return ans;
        Queue<TreeNode> treeNodes=new LinkedList<TreeNode>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            int size=treeNodes.size();
            List<Integer> rowans=new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode node=treeNodes.poll();
                rowans.add(node.val);
                if (node.left!=null)
                    treeNodes.add(node.left);
                if (node.right!=null)
                    treeNodes.add(node.right);
            }
            ans.add(rowans);
        }
        Collections.reverse(ans);
        return ans;
    }
}
