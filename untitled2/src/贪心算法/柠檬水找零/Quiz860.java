package 贪心算法.柠檬水找零;

/**
 * @author zx
 * @date 2021/11/06 14:49
 */
public class Quiz860 {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0]!=5)
            return false;
        int[] changes=new int[2];//分别代表5美元、10美元钞票的数量，初始都为0（20美元无法用于找零，不计入）
        for (int i = 0; i < bills.length; i++) {
            if (bills[i]==5)//付5美元，无需找零
                changes[0]++;
            else if (bills[i]==10) {//付10美元，需要找零5美元
                if (changes[0]==0)//没有5美元，返回false
                    return false;
                else {//5美元钞票减一，10美元钞票加一
                    changes[0]--;
                    changes[1]++;
                }
            }
            else {//付20美元，需要找零15美元，找10+5或5+5+5
                if (changes[0]==0)//没有5美元，没办法找钱
                    return false;
                else {
                    if (changes[1]>0) {//有10美元，则找10+5即可
                        changes[1]--;
                        changes[0]--;
                    } else {//没有10美元，必需找3张5美元
                        if (changes[0]<3)
                            return false;
                        else
                            changes[0]-=3;
                    }
                }
            }
        }
        return true;//循环下来没返回说明可以正确找零，返回true
    }
}
