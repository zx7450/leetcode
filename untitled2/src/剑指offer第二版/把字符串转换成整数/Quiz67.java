package 剑指offer第二版.把字符串转换成整数;

/**
 * @author zx
 * @date 2022/3/14 10:01
 */
public class Quiz67 {
    public int strToInt(String str) {
        char[] c=str.trim().toCharArray();//删除首尾无用空格并转换为字符数组
        if (c.length==0) return 0;
        int i=1,sign=1;
        int res=0,boundry=Integer.MAX_VALUE/10;
        if (c[0]=='-') sign=-1;
        else if (c[0]!='+') i=0;
        for (int j = i; j < c.length; j++) {
            if (c[j]<'0'||c[j]>'9') break;
            if (res>boundry||res==boundry&&c[j]>'7') return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            res=res*10+(c[j]-'0');
        }
        return sign*res;
    }
}
