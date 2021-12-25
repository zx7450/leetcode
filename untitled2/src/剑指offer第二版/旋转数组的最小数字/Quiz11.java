package 剑指offer第二版.旋转数组的最小数字;

/**
 * @author zx
 * @date 2021/12/25 10:25
 */
public class Quiz11 {
    //    public int minArray(int[] numbers) {
//        int numlen=numbers.length;
//        if (numlen==1)
//            return numbers[0];
//        else if (numlen==2)
//            return numbers[0]<numbers[1]?numbers[0]:numbers[1];
//        int pre=numbers[0];
//        for (int i = 1; i < numlen; i++) {
//            if (numbers[i]<pre)
//                return numbers[i];
//            pre=numbers[i];
//        }
//        return numbers[0];
//    }
    public int minArray(int[] numbers) {//二分查找
        int numlen = numbers.length;
        if (numlen == 1)
            return numbers[0];
        else if (numlen == 2)
            return numbers[0] < numbers[1] ? numbers[0] : numbers[1];
        int low=0,high=numlen-1;
        while (low<high){
            int mid=low+(high-low)/2;
            if (numbers[mid]<numbers[high])
                high=mid;
            else if (numbers[mid]>numbers[high])
                low=mid+1;
            else
                high--;
        }
        return numbers[low];
    }
}
