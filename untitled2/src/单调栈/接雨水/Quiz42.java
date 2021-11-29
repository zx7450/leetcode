package 单调栈.接雨水;

import java.util.Stack;

/**
 * @author zx
 * @date 2021/11/29 9:29
 */
public class Quiz42 {
//    public int trap(int[] height) {//动态规划
//        int heilen=height.length;
//        if (heilen<=2)
//            return 0;
//        int[] maxleft=new int[heilen];
//        maxleft[0]=height[0];
//        for (int i = 1; i < heilen; i++) {
//            maxleft[i]=Math.max(maxleft[i-1],height[i]);//求每个位置的左边最高的柱子
//        }
//        int[] maxright=new int[heilen];
//        maxright[heilen-1]=height[heilen-1];
//        for (int i = heilen-2; i >= 0; i--) {
//            maxright[i]=Math.max(maxright[i+1],height[i]);//求每个位置的右边最高的柱子
//        }
//        int res=0;
//        for (int i = 0; i < heilen; i++) {
//            res+=Math.min(maxleft[i],maxright[i])-height[i];//该位置接到的雨水量为其左右两边最高位置的较小值减去该位置柱子的高度
//        }
//        return res;
//    }
    public int trap(int[] height) {
        int heilen=height.length;
        if (heilen<=2)
            return 0;
        Stack<Integer> stack=new Stack<>();
        int ans=0;
        for (int i = 0; i < heilen; i++) {
            while (!stack.isEmpty()&&height[i]>height[stack.peek()]){
                int top=stack.pop();
                if (stack.isEmpty())
                    break;
                int left=stack.peek();
                int width=i-left-1;
                int heigh=Math.min(height[i],height[left])-height[top];
                ans+=width*heigh;
            }
            stack.push(i);
        }
        return ans;
    }
}
