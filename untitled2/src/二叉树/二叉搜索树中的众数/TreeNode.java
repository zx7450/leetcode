package 二叉树.二叉搜索树中的众数;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {//Quiz501
    int val;
    TreeNode left;
    TreeNode right;
    int maxcount=0;
    TreeNode pre=null;
    int count=0;
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

    public int[] findMode(TreeNode root) {
        if (root==null) return new int[0];
        List<Integer> ans=new ArrayList<Integer>();
        traversal(root,ans);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public void traversal(TreeNode root,List<Integer> ans) {
        if (root == null) return;
        traversal(root.left, ans);
        if (pre == null) {
            pre = root;
            count++;
            maxcount++;
        } else {
            if (pre.val == root.val) {
                count++;
            } else {
                pre = root;
                count = 1;
            }
        }
        if (count == maxcount)
            ans.add(pre.val);
        else if (count > maxcount) {
            ans.clear();
            ans.add(pre.val);
            maxcount = count;
        }
        traversal(root.right, ans);
    }
}
