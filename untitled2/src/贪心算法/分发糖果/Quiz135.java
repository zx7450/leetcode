package 贪心算法.分发糖果;

/**
 * @author zx
 * @date 2021/11/06 10:30
 */
public class Quiz135 {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] candyNum=new int[n];
        for (int i = 0; i < n; i++) {
            candyNum[i]=1;
        }
        for (int i = 1; i < n; i++) {//本循环只考虑右边孩子评分比左边高的情况
            if (ratings[i]>ratings[i-1])
                candyNum[i]=candyNum[i-1]+1;//若右孩子评分高于左孩子，他得到的糖果数应比左孩子多1
        }
        for (int i = n-2; i >= 0; i--) {//本循环只考虑左边孩子评分比右边高的情况
            if (ratings[i]>ratings[i+1])//若左孩子评分高于右孩子，他得到的糖果数应比右孩子多1
                candyNum[i]=Math.max(candyNum[i],candyNum[i+1]+1);
        }
        int candySum=0;
        for (int i = 0; i < n; i++) {
            candySum+=candyNum[i];
        }
        return candySum;
    }
}
