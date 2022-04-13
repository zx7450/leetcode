package 程序员面试金典.动物收容所;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2022/4/13 9:22
 */
public class AnimalShelf {//Quiz03.06
    Queue<int[]> cat;
    Queue<int[]> dog;
    public AnimalShelf() {
        cat=new LinkedList<>();
        dog=new LinkedList<>();
    }

    public void enqueue(int[] animal) {
        if (animal[1]==0)
            cat.add(animal);
        else
            dog.add(animal);
    }

    public int[] dequeueAny() {
        if (!cat.isEmpty()&&!dog.isEmpty()) {
            if (cat.peek()[0]<dog.peek()[0])
                return cat.poll();
            else
                return dog.poll();
        } else {
            if (cat.isEmpty())
                return dog.isEmpty()?new int[]{-1,-1}:dog.poll();
            else
                return cat.poll();
        }
    }

    public int[] dequeueDog() {
        return dog.isEmpty()?new int[]{-1,-1}:dog.poll();
    }

    public int[] dequeueCat() {
        return cat.isEmpty()?new int[]{-1,-1}:cat.poll();
    }
}
