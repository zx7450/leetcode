package 二叉树.二叉树的所有路径;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {//Quiz257
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
    public List<String> binaryTreePaths(TreeNode root) {//递归（回溯）法
        List<String> res=new ArrayList<String>();
        List<Integer> path=new ArrayList<Integer>();
        traversal(root,path,res);
        return res;
    }
    public void traversal(TreeNode node,List<Integer> path,List<String> res) {
        path.add(node.val);
        if (node.left==null&&node.right==null){
            StringBuilder stringBuilder=new StringBuilder();
            for (int i = 0; i < path.size()-1; i++) {
                stringBuilder.append(path.get(i)).append("->");
            }
            stringBuilder.append(path.get(path.size()-1));
            res.add(stringBuilder.toString());
            return;
        }
        if (node.left!=null) {
            traversal(node.left,path,res);
            path.remove(path.size()-1);
        }
        if (node.right!=null){
            traversal(node.right,path,res);
            path.remove(path.size()-1);
        }
    }
}
