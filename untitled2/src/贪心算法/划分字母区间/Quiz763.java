package 贪心算法.划分字母区间;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2021/11/08 10:13
 */
public class Quiz763 {
    public List<Integer> partitionLabels(String s) {
        int[] hash=new int[26];//记录字母出现的最远位置
        int slen=s.length();
        List<Integer> res=new ArrayList<>();
        for (int i = 0; i < slen; i++) {
            hash[s.charAt(i)-'a']=i;
        }
        int start=0,end=0;//记录字母子区间的开始位置和结束位置
        for (int i = 0; i < slen; i++) {
            end=Math.max(end,hash[s.charAt(i)-'a']);
            if (i==end) {
                res.add(end-start+1);
                start=end+1;
            }
        }
        return res;
    }
}
