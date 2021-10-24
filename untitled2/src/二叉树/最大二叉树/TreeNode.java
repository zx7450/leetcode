package 二叉树.最大二叉树;

/**
 * @author zx
 * @date 2021/10/24 23:00
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    int[] nums;
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        this.nums=nums;
        return Create(0,nums.length-1);
    }
    public TreeNode Create(int left,int right) {
        if (left>right) return null;
        int max=-1;
        int index=-1;
        for (int i = left; i <= right; i++) {
            if (nums[i]>max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root=new TreeNode(max);
        root.left=Create(left,index-1);
        root.right=Create(index+1,right);
        return root;
    }
}
