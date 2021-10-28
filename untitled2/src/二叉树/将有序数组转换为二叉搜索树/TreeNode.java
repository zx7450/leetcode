package 二叉树.将有序数组转换为二叉搜索树;

public class TreeNode {//Quiz108
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

    public TreeNode sortedArrayToBST(int[] nums) {
        return CreateBST(nums,0,nums.length-1);
    }

    public TreeNode CreateBST(int[] nums,int leftposit,int rightposit) {
        if (leftposit>rightposit) return null;
        int mid=(leftposit+rightposit)/2;
        TreeNode newnode=new TreeNode(nums[mid]);
        newnode.left=CreateBST(nums,leftposit,mid-1);
        newnode.right=CreateBST(nums,mid+1,rightposit);
        return newnode;
    }
}
