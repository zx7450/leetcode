package 剑指offer第二版.从上到下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zx
 * @date 2022/3/15 10:19
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Mianshi32_1 {
    List<Integer> ans;
    public int[] levelOrder(TreeNode root) {
        ans=new ArrayList<>();
        if (root==null)
            return new int[0];
        Queue<TreeNode> nodeQueue=new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            TreeNode node=nodeQueue.poll();
            ans.add(node.val);
            if (node.left!=null)
                nodeQueue.add(node.left);
            if (node.right!=null)
                nodeQueue.add(node.right);
        }
        int[] finalans=new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            finalans[i]=ans.get(i);
        }
        return finalans;
    }
}
