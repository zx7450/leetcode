package 程序员面试金典.三合一;

/**
 * @author zx
 * @date 2022/4/11 9:55
 */
public class TripleInOne {//Quiz03_01

    int[][] Triplestack;
    int[] top = {0, 0, 0};

    public TripleInOne(int stackSize) {
        Triplestack = new int[3][stackSize];
    }

    public void push(int stackNum, int value) {
        if (top[stackNum] == Triplestack[0].length)
            return;
        Triplestack[stackNum][top[stackNum]] = value;
    }

    public int pop(int stackNum) {
        if (top[stackNum] == 0) {
            return -1;
        }
        int val=Triplestack[stackNum][top[stackNum]-1];
        top[stackNum]--;
        return val;
    }

    public int peek(int stackNum) {
        if (top[stackNum] == 0) {
            return -1;
        }
        return Triplestack[stackNum][top[stackNum]-1];
    }

    public boolean isEmpty(int stackNum) {
        return top[stackNum] == 0 ? true : false;
    }
}
