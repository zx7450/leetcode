package 程序员面试金典.一次编辑;

/**
 * @author zx
 * @date 2022/3/17 9:48
 */
public class Quiz01_05 {
    public boolean oneEditAway(String first, String second) {
        int firlen=first.length(),seclen=second.length();
        if (seclen>firlen)
            return oneEditAway(second,first);
        if (firlen-seclen>1)
            return false;
        else if (firlen==seclen) {
            if (first.equals(second))
                return true;
            else {
                boolean hasdiff=false;
                for (int i = 0; i < first.length(); i++) {
                    if (first.charAt(i)!=second.charAt(i)) {
                        if (hasdiff)
                            return false;
                        else
                            hasdiff=true;
                    }
                }
                return true;
            }
        }
        else {
            int i=0,j=0;
            boolean oneEdit=false;
            while (j<seclen) {
                if (first.charAt(i)!=second.charAt(j)) {
                    if (oneEdit)
                        return false;
                    else {
                        oneEdit = true;
                        i++;
                        continue;
                    }
                }
                i++;
                j++;
            }
            return true;
        }
    }
}
