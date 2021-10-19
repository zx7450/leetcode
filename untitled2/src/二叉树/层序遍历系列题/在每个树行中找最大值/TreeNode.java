package 二叉树.层序遍历系列题.在每个树行中找最大值;

import java.util.*;

public class TreeNode {//Quiz515
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root==null)
            return ans;
        Queue<TreeNode> treeNodes=new LinkedList<TreeNode>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            int size=treeNodes.size();
            int max=0;
            for (int i = 0; i < size; i++) {
                TreeNode node=treeNodes.poll();
                if (i==0)
                    max=node.val;
                else
                    max=max>node.val?max: node.val;
                if (node.left!=null)
                    treeNodes.add(node.left);
                if (node.right!=null)
                    treeNodes.add(node.right);
            }
            ans.add(max);
        }
        return ans;
    }
}
