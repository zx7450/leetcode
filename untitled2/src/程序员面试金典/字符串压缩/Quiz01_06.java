package 程序员面试金典.字符串压缩;

/**
 * @author zx
 * @date 2022/3/21 11:13
 */
public class Quiz01_06 {
    public String compressString(String S) {
        StringBuilder stringBuilder=new StringBuilder();
        int counts=0;
        int slen=S.length();
        for (int i = 0; i < slen; i++) {
            if (i==0||S.charAt(i)!=S.charAt(i-1)) {
                if (counts != 0)
                    stringBuilder.append(counts);
                stringBuilder.append(S.charAt(i));
                counts=1;
            } else
                counts++;
        }
        String res=stringBuilder.append(counts).toString();
        return res.length()>=slen?S:res;
    }
}
