package 程序员面试金典.判断字符是否唯一;

/**
 * @author zx
 * @date 2022/3/16 9:32
 */
public class Quiz01_01 {
    public boolean isUnique(String astr) {
        int strlen=astr.length();
        if (strlen<2)
            return true;
        boolean[] hasoccur=new boolean[26];
        for (int i = 0; i < strlen; i++) {
            if (hasoccur[astr.charAt(i)-'a'])
                return false;
            hasoccur[astr.charAt(i)-'a']=true;
        }
        return true;
    }
}
