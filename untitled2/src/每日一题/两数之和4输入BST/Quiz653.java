package 每日一题.两数之和4输入BST;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zx
 * @date 2022/3/21 10:56
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

public class Quiz653 {
    Set<Integer> numofbst = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null)
            return false;
        if (numofbst.contains(k - root.val))
            return true;
        numofbst.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
