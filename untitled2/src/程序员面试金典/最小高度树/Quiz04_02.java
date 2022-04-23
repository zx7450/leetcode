package 程序员面试金典.最小高度树;

/**
 * @author zx
 * @date 2022/4/14 9:10
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Quiz04_02 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums,0, nums.length-1);
    }

    public TreeNode createBST(int[] nums,int leftpos,int rightpos) {
         if (leftpos>rightpos)
             return null;
         int mid=(leftpos+rightpos)/2;
         TreeNode root=new TreeNode(nums[mid]);
         root.left=createBST(nums,leftpos,mid-1);
         root.right=createBST(nums,mid+1,rightpos);
         return root;
    }
}
