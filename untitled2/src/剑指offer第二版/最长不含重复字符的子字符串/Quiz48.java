package 剑指offer第二版.最长不含重复字符的子字符串;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zx
 * @date 2022/3/2 8:57
 */
public class Quiz48 {
//    public int lengthOfLongestSubstring(String s) {//滑动窗口+哈希表
//        int slen=s.length();
//        if (slen==0)
//            return 0;
//        else if (slen==1)
//            return 1;
//        int left=0,right=0,ans=0,len=0;
//        Set<Character> hasaccur=new HashSet<>();
//        while (right<slen) {
//            Character c=s.charAt(right);
//            if (!hasaccur.contains(c)) {
//                hasaccur.add(c);
//                len++;
//                right++;
//                ans=ans>len?ans:len;
//            } else {
//                hasaccur.remove(s.charAt(left));
//                left++;
//                len--;
//            }
//        }
//        return ans;
//    }

    public int lengthOfLongestSubstring(String s) {//dp+哈希表
        int slen=s.length();
        if (slen==0)
            return 0;
        else if (slen==1)
            return 1;
        Map<Character,Integer> dic=new HashMap<>();//存放着某个字符距离最近的相同字符位置，若无相同字符则置为-1
        int ans=0,tmp=0;//由于状态转移仅取决于上一步的情况，故采用滚动数组方法
        for (int j = 0; j < slen; j++) {
            int i=dic.getOrDefault(s.charAt(j),-1);
            dic.put(s.charAt(j),j);
            tmp=tmp<j-i?tmp+1:j-i;
            ans=Math.max(ans,tmp);
        }
        return ans;
    }
}
