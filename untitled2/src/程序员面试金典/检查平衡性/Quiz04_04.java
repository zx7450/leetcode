package 程序员面试金典.检查平衡性;

import java.util.Map;

/**
 * @author zx
 * @date 2022/4/16 10:40
 */
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Quiz04_04 {
    public boolean isBalanced(TreeNode root) {
        return gethigh(root)!=-1;
    }

    public int gethigh(TreeNode root) {
        if (root==null)
            return 0;
        int lefthigh=gethigh(root.left);
        if (lefthigh==-1) return -1;
        int righthigh=gethigh(root.right);
        if (righthigh==-1) return -1;
        if (Math.abs(lefthigh-righthigh)>1)
            return -1;
        return (lefthigh>righthigh?lefthigh:righthigh)+1;
    }
}
