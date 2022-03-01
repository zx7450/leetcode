package 剑指offer第二版.把数组排成最小的数;

/**
 * @author zx
 * @date 2022/3/1 9:03
 */
public class Quiz45 {
    public String minNumber(int[] nums) {
        int numlen= nums.length;
        String[] s=new String[numlen];
        for (int i = 0; i < numlen; i++) {
            s[i]=String.valueOf(nums[i]);
        }
        quicksort(s,0,numlen-1);
        StringBuilder stringBuilder=new StringBuilder();
        for (String s1:s) {
            stringBuilder.append(s1);
        }
        return stringBuilder.toString();
    }

    public void quicksort(String[] s,int l,int r) {
        if (l>=r) return;
        int i=l,j=r;
        String tem=s[i];
        while (i<j) {
            while ((s[j]+s[l]).compareTo(s[l]+s[j])>=0&&i<j) j--;
            while ((s[i]+s[l]).compareTo(s[l]+s[i])<=0&&i<j) i++;
            tem=s[i];
            s[i]=s[j];
            s[j]=tem;
        }
        s[i]=s[l];
        s[l]=tem;
        quicksort(s,l,i-1);
        quicksort(s,i+1,r);
    }
}
