package 回溯算法.分割回文串;

import java.util.ArrayList;
import java.util.List;

public class Quiz131 {
    List<String> path=new ArrayList<>();
    List<List<String>> result=new ArrayList<>();
    public List<List<String>> partition(String s) {
        if (s.length()==1){
            path.add(s);
            result.add(new ArrayList<>(path));
            return result;
        }
        backtracing(s,0);
        return result;
    }
    public void backtracing(String s,int startpos){
        if (startpos>=s.length()){// 如果起始位置已经大于s的大小，说明已经找到了一组分割方案了
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startpos; i < s.length(); i++) {
            if (isPartition(s,startpos,i)){
                path.add(s.substring(startpos,i+1));
                backtracing(s,i+1);
                path.remove(path.size()-1);
            } else
                continue;
        }
    }
    public boolean isPartition(String s,int begin,int end){
        while (begin<end){
            if (s.charAt(begin)!=s.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }
}
