package 程序员面试金典.堆盘子;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zx
 * @date 2022/4/12 9:15
 */
public class StackOfPlates {//Quiz03_03
    List<Stack<Integer>> stackofplates;
    int maxsize;

    public StackOfPlates(int cap) {
        stackofplates = new ArrayList<>();
        maxsize = cap;
    }

    public void push(int val) {
        if (maxsize<=0)
            return;
        if (stackofplates.isEmpty() || stackofplates.get(stackofplates.size() - 1).size() == maxsize) {
            Stack<Integer> plates = new Stack<>();
            plates.push(val);
            stackofplates.add(plates);
        } else
            stackofplates.get(stackofplates.size() - 1).push(val);
    }

    public int pop() {
        return popAt(stackofplates.size()-1);
    }

    public int popAt(int index) {
        if (index >= stackofplates.size()||index<0)
            return -1;
        Stack<Integer> tempstack=stackofplates.get(index);
        int val = tempstack.pop();
        if (tempstack.isEmpty())
            stackofplates.remove(index);
        return val;
    }
}
