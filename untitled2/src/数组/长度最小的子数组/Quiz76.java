package 数组.长度最小的子数组;

import java.util.HashMap;
import java.util.HashSet;

public class Quiz76 {
    public String minWindow(String s, String t) {
        if (s.length()<t.length())
            return "";
        HashMap<Character,Integer> freqt=new HashMap<Character,Integer>();//表示s中需要出现字符及其数量
        for (int i = 0; i < t.length(); i++) {
            if (freqt.containsKey(t.charAt(i)))
                freqt.computeIfPresent(t.charAt(i),(key,value)->value+1);
            else
                freqt.put(t.charAt(i),1);
        }
        int head=0,tail=0,subL=0,subR=0,minlen=-1;
        int requircount=t.length();
        while (tail<s.length()){
            if (freqt.containsKey(s.charAt(tail))) {
                if (freqt.get(s.charAt(tail))>0) {
                    requircount--;
                }
                freqt.computeIfPresent(s.charAt(tail), (key, value) -> value - 1);
                if (requircount == 0) {
                    while (requircount==0){
                        if (freqt.containsKey(s.charAt(head))){
                            freqt.computeIfPresent(s.charAt(head), (key, value) -> value + 1);
                            if (freqt.get(s.charAt(head))>0)
                                requircount++;
                        }
                        head++;
                    }
                    if (minlen==-1||minlen>(tail-(head-1)+1)){
                        subL=head-1;
                        subR=tail;
                        minlen=subR-subL+1;
                    }
                }
            }
            tail++;
        }
        if (minlen==-1)
            return "";
        return s.substring(subL,subR+1);
    }
}
