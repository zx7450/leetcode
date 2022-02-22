package 剑指offer第二版.二叉搜索树的后序遍历序列;

/**
 * @author zx
 * @date 2022/2/22 10:05
 */
public class Quiz33 {
    public boolean verifyPostorder(int[] postorder) {
        return checkPostorder(postorder,0, postorder.length-1);
    }
    public boolean checkPostorder(int[] postorder,int left,int right) {
        if (left>=right)
            return true;
        int rightflag=left;
        while (postorder[rightflag]<postorder[right])
            rightflag++;
        int i=rightflag;
        while (postorder[i]>postorder[right])
            i++;
        return i==right&&checkPostorder(postorder,left,rightflag-1)&&checkPostorder(postorder,rightflag,right-1);
    }
}
