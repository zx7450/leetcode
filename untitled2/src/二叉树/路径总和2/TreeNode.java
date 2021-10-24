package 二叉树.路径总和2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2021/10/24 18:03
 */
public class TreeNode {
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if (root==null) return ans;
        List<Integer> path=new ArrayList<Integer>();
        getAllpath(root,targetSum,ans,path);
        return ans;
    }
    public void getAllpath(TreeNode root,int targetSum,List<List<Integer>> ans,List<Integer> path) {
        targetSum-=root.val;
        path.add(root.val);
        if (root.left==null&&root.right==null) {
            if (targetSum==0) {
                ans.add(new ArrayList<>(path));
            }
        } else {
            if (root.left!=null)
                getAllpath(root.left,targetSum,ans,path);
            if (root.right!=null)
                getAllpath(root.right,targetSum,ans,path);
        }
        path.remove(path.size()-1);
        return;
    }
}
