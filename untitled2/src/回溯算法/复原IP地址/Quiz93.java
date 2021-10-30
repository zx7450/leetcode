package 回溯算法.复原IP地址;

import java.util.ArrayList;
import java.util.List;

public class Quiz93 {
    List<String> ans=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if (s.length()>12)
            return ans;
        turnToIP(s,0,0);
        return ans;
    }
    public void turnToIP(String s,int startpos,int segnum) {
        if (segnum==3) {//分段数为3，判断最后一段是否合法即可
            if (isValid(s,startpos,s.length()-1))
                ans.add(s);
            return;
        }
        for (int i = startpos; i < s.length(); i++) {
            if (isValid(s,startpos,i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);//在str的后⾯插⼊⼀个逗点
                turnToIP(s, i + 2, segnum + 1);// 插⼊逗点之后下⼀个⼦串的起始位置为i+2
                s = s.substring(0, i + 1) + s.substring(i + 2);
            }
            else
                break;
        }
    }
    public boolean isValid(String s,int begin,int end){
        if (begin>end)
            return false;
        if (s.charAt(begin)=='0'&&begin!=end)//以0开头且位数不为1
            return false;
        int num=0;
        while (begin<=end){
            num=num*10+(s.charAt(begin)-'0');
            if (num>255)
                return false;
            begin++;
        }
        return true;
    }
}
