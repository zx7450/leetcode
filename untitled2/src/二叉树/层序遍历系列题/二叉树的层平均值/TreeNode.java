package 二叉树.层序遍历系列题.二叉树的层平均值;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {//Quiz637
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<Double>();
        if (root==null)
            return ans;
        Queue<TreeNode> treeNodes=new LinkedList<TreeNode>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            int size=treeNodes.size();
            double levelsum=0;
            for (int i = 0; i < size; i++) {
                TreeNode node=treeNodes.poll();
                levelsum+=node.val;
                if (node.left!=null)
                    treeNodes.add(node.left);
                if (node.right!=null)
                    treeNodes.add(node.right);
            }
            ans.add(levelsum/size);
        }
        return ans;
    }
}
