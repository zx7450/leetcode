package 剑指offer第二版.二叉树中和为某一值的路径;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2022/2/23 9:16
 */

class TreeNode {
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
}

public class Quiz34 {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    int target;
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root==null) return ans;
        this.target=target;
        dfs(root,0);
        return ans;
    }

    public void dfs(TreeNode treeNode,int pathsum) {
        pathsum+=treeNode.val;
        path.add(treeNode.val);
        if (treeNode.left==null&&treeNode.right==null) {
            if (pathsum == target)
                ans.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }
        if (treeNode.left!=null)
            dfs(treeNode.left,pathsum);
        if (treeNode.right!=null)
            dfs(treeNode.right,pathsum);
        path.remove(path.size()-1);
    }
}
