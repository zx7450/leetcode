package 每日一题.蜡烛之间的盘子;

/**
 * @author zx
 * @date 2022/3/8 9:06
 */
public class Quiz2055 {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n=s.length();
        int[] presum=new int[n];
        for (int i = 0,sum=0; i < n; i++) {//求每个位置的前缀包含*的数量
            if (s.charAt(i)=='*')
                sum++;
            presum[i]=sum;
        }
        int[] left=new int[n];
        for (int i = 0,l=-1; i < n; i++) {
            if (s.charAt(i)=='|')
                l=i;
            left[i]=l;
        }
        int[] right=new int[n];
        for (int i=n-1,r=-1;i>=0;i--) {
            if (s.charAt(i)=='|')
                r=i;
            right[i]=r;
        }
        int[] ans=new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x=right[queries[i][0]],y=left[queries[i][1]];//求左端点右边的第一个蜡烛和右端点左边的第一个蜡烛
            ans[i]=(x==-1||y==-1||x>=y)?0:presum[y]-presum[x];
        }
        return ans;
    }


}
