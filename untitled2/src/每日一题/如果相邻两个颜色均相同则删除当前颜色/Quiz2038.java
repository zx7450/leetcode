package 每日一题.如果相邻两个颜色均相同则删除当前颜色;

/**
 * @author zx
 * @date 2022/3/22 10:26
 */
public class Quiz2038 {
    public boolean winnerOfGame(String colors) {
        int len=colors.length();
        if (len<3)
            return false;
        char currcolor='A';
        int occurtimes=0;
        int[] step=new int[]{0,0};
        for (int i = 0; i < len; i++) {
            char c=colors.charAt(i);
            if (c!=currcolor) {
                currcolor=c;
                occurtimes=1;
            } else {
                if (++occurtimes>=3)
                    step[c-'A']++;
            }
        }
        return step[0]>step[1];
    }
}
