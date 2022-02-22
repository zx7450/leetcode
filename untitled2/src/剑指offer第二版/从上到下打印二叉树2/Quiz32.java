package 剑指offer第二版.从上到下打印二叉树2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zx
 * @date 2022/2/22 9:36
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Quiz32 {
    public List<List<Integer>> levelOrder(TreeNode root) {//迭代法
        if (root==null)
            return new ArrayList<List<Integer>>();
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> treeNodeQueue=new LinkedList<>();
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()) {
            int size=treeNodeQueue.size();
            List<Integer> rownums=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node=treeNodeQueue.poll();
                rownums.add(node.val);
                if (node.left!=null) treeNodeQueue.add(node.left);
                if (node.right!=null) treeNodeQueue.add(node.right);
            }
            ans.add(rownums);
        }
        return ans;
    }
}
