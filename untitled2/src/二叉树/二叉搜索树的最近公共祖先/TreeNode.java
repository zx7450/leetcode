package 二叉树.二叉搜索树的最近公共祖先;

public class TreeNode {//Quiz235
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {//递归法
//        int low,high;
//        if (p.val>q.val) {
//            low=q.val;
//            high=p.val;
//        } else {
//            low=p.val;
//            high= q.val;
//        }
//        return findans(root,low,high);
//    }
//
//    public TreeNode findans(TreeNode root,int low,int high) {
//        if (root.val==low||root.val==high||(root.val>low&&root.val<high)) return root;
//        else if (root.val<low) return findans(root.right,low,high);
//        else return findans(root.left,low,high);
//    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {//迭代法
        TreeNode Ance=root;
        int low,high;
        if (p.val>q.val) {
            low=q.val;
            high=p.val;
        } else {
            low=p.val;
            high= q.val;
        }
        while (true){
            if (Ance.val==low||Ance.val==high||(Ance.val>low&&Ance.val<high)) return Ance;
            else if (Ance.val<low) Ance=Ance.right;
            else Ance=Ance.left;
        }
    }
}
