package 每日一题.奇偶树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2021/12/25 10:00
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

    public boolean isEvenOddTree(TreeNode root) {//Quiz1609
        if (root.left==null&&root.right==null)
            if (root.val%2!=0)
                return true;
            else return false;
        Queue<TreeNode> treeNodeQueue=new LinkedList<>();
        treeNodeQueue.add(root);
        boolean single=false;
        while (!treeNodeQueue.isEmpty()) {
            int size=treeNodeQueue.size();
            int pre=0;
            for (int i = 0; i < size; i++) {
                TreeNode current=treeNodeQueue.poll();
                if (single==false) {
                    if (current.val%2==0||(pre>=current.val))
                        return false;
                } else {
                    if (current.val%2!=0||(pre!=0&&pre<=current.val))
                        return false;
                }
                pre=current.val;
                if (current.left!=null)
                    treeNodeQueue.add(current.left);
                if (current.right!=null)
                    treeNodeQueue.add(current.right);
            }
            if (single==false)
                single=true;
            else
                single=false;
        }
        return true;
    }
}
