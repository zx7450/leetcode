package 字符串.亲密字符串;

/**
 * @author zx
 * @date 2021/11/23 10:28
 */
public class Quiz859 {
    public boolean buddyStrings(String s, String goal) {
        int slen=s.length();
        int golen=goal.length();
        if (slen!=golen)
            return false;
        if (s.equals(goal)) {
            int[] charnum=new int[26];
            for (int i = 0; i < slen; i++) {
                charnum[s.charAt(i)-'a']++;
                if (charnum[s.charAt(i)-'a']==2)
                    return true;
            }
            return false;
        } else {
            int firstpos=-1;
            int secondpos=-1;
            for (int i = 0; i < slen; i++) {
                if (s.charAt(i)!=goal.charAt(i))
                    if (firstpos==-1)
                        firstpos=i;
                    else if (secondpos==-1)
                        secondpos=i;
                    else
                        return false;
            }
            return (secondpos!=-1&&s.charAt(firstpos)==goal.charAt(secondpos)&&s.charAt(secondpos)==goal.charAt(firstpos));
        }
    }
}
