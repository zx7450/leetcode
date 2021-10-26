package 二叉树.二叉搜索树中的插入操作;

public class TreeNode {//Quiz701
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

//    public TreeNode insertIntoBST(TreeNode root, int val) {//递归法
//        if (root==null) return new TreeNode(val);
//        findAndInsert(root,val);
//        return root;
//    }
//    public void findAndInsert(TreeNode root,int val) {
//        if (root.val>val)
//            if (root.left==null)
//                root.left=new TreeNode(val);
//            else
//                findAndInsert(root.left,val);
//        else
//            if (root.right==null)
//                root.right=new TreeNode(val);
//            else
//                findAndInsert(root.right,val);
//    }
    public TreeNode insertIntoBST(TreeNode root, int val) {//迭代法
        if (root==null) return new TreeNode(val);
        TreeNode parent=root;
        TreeNode current=root;
        while(current!=null){
            parent=current;
            if (current.val>val)
                current=current.left;
            else
                current=current.right;
        }
        TreeNode newnode=new TreeNode(val);
        if (parent.val>val) parent.left=newnode;
        else parent.right=newnode;
        return root;
    }
}
