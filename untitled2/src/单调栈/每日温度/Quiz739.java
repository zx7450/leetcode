package 单调栈.每日温度;

import java.util.Stack;

/**
 * @author zx
 * @date 2021/11/26 9:10
 */
public class Quiz739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int temlen=temperatures.length;
        if (temlen==1)
            return new int[1];
        int[] highertemp=new int[temlen];
        Stack<Integer> temper=new Stack<>();
        int popvalue=0;
        for (int i = 0; i < temlen; i++) {
            while (!temper.isEmpty()&&temperatures[temper.peek()]<temperatures[i]) {
                popvalue=temper.pop();
                highertemp[popvalue]=i-popvalue;
            }
            temper.push(i);
        }
        return highertemp;
    }
}
