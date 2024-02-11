package 动态规划.打家劫舍3;

import 二叉树类.TreeNode;

/**
 * @author zx
 * @date 2024/2/11 16:54
 */
public class Quiz337 {
    public int rob(TreeNode root) {
        if (root.left == null && root.right == null)
            return root.val;
        int[] ans = dp(root);
        return Math.max(ans[0], ans[1]);
    }

    public int[] dp(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        int[] leftans = dp(node.left);
        int[] rightans = dp(node.right);
        int[] ans = new int[2];
        ans[0] = Math.max(leftans[0], leftans[1]) + Math.max(rightans[0], rightans[1]);
        ans[1] = leftans[0] + rightans[0] + node.val;
        return ans;
    }
}
