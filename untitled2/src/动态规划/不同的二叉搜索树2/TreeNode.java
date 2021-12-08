package 动态规划.不同的二叉搜索树2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zx
 * @date 2021/12/8 9:22
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    List<TreeNode> ans=new ArrayList<>();
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

    public List<TreeNode> generateTrees(int n) {
        return creatTrees(1,n);
    }

    public List<TreeNode> creatTrees(int start,int end) {
        List<TreeNode> allTrees=new LinkedList<>();
        if (start>end) {
            allTrees.add(null);
            return allTrees;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> lefttrees=creatTrees(start,i-1);
            List<TreeNode> righttrees=creatTrees(i+1,end);
            for (TreeNode left:lefttrees) {
                for (TreeNode right:righttrees) {
                    TreeNode currtree=new TreeNode(i);
                    currtree.left=left;
                    currtree.right=right;
                    allTrees.add(currtree);
                }
            }
        }
        return allTrees;
    }
}
