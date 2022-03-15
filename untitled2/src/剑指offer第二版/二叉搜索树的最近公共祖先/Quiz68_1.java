package 剑指offer第二版.二叉搜索树的最近公共祖先;

/**
 * @author zx
 * @date 2022/3/15 9:15
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Quiz68_1 {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {//递归法
//        int low,high;
//        if (p.val< q.val) {
//            low=p.val;
//            high= q.val;
//        } else {
//            low=q.val;
//            high= p.val;
//        }
//        return findAnce(root,low,high);
//    }
//
//    public TreeNode findAnce(TreeNode root,int low,int high) {
//        if (root.val==low||root.val==high||(root.val>low&&root.val<high)) return root;
//        else if (root.val<low) return findAnce(root.right,low,high);
//        else return findAnce(root.left,low,high);
//    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {//迭代法
        int low,high;
        if (p.val<q.val) {
            low=p.val;
            high=q.val;
        } else {
            low=q.val;
            high=p.val;
        }
        while (true) {
            if (root.val==low||root.val==high||(root.val>low&&root.val<high))
                break;
            else if (root.val<low)
                root=root.right;
            else
                root=root.left;
        }
        return root;
    }
}
