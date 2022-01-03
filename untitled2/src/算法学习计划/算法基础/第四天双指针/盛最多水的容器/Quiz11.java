package 算法学习计划.算法基础.第四天双指针.盛最多水的容器;

/**
 * @author zx
 * @date 2021/12/31 16:02
 */
public class Quiz11 {
    public int maxArea(int[] height) {//思路：双指针分别指向数组头尾，每次移动较小高度的指针
        int heilen=height.length;
        if (heilen==2)
            return height[0]<height[1]?height[0]:height[1];
        int left=0,right=heilen-1;
        int ans=-1;
        while (left<right) {
            int currenarea;
            if (height[left]<height[right]) {
                currenarea=height[left]*(right-left);
                ans=currenarea>ans?currenarea:ans;
                left++;
            } else {
                currenarea=height[right]*(right-left);
                ans=currenarea>ans?currenarea:ans;
                right--;
            }
        }
        return ans;
    }
}
