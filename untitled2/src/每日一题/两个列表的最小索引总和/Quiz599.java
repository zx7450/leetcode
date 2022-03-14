package 每日一题.两个列表的最小索引总和;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zx
 * @date 2022/3/14 9:13
 */
public class Quiz599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length> list2.length)
            return findRestaurant(list2,list1);
        Map<String,Integer> list1map=new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            list1map.put(list1[i],i);
        }
        int minsum=Integer.MAX_VALUE;
        List<String> ans=new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (list1map.containsKey(list2[i])) {
                int j=list1map.get(list2[i]);
                if (i+j<minsum) {
                    minsum=i+j;
                    ans.clear();
                    ans.add(list2[i]);
                } else if (i+j==minsum)
                    ans.add(list2[i]);
            }
        }
        String[] finalans=new String[ans.size()];
        return ans.toArray(finalans);
    }
}
