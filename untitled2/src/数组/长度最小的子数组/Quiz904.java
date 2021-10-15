package 数组.长度最小的子数组;

public class Quiz904 {
    public int totalFruit(int[] fruits) {
        int[] typenum=new int[2];
        typenum[0]=typenum[1]=0;
        int type1=-1;
        int type2=-1;
        int ans=0;
        int length=0;
        int head=0;
        int tail=0;
        while (tail<fruits.length){
            //if (type1==-1&&type2==-1){
            if(type1==-1){
                if (type2!=fruits[tail]) {
                    type1 = fruits[tail];
                    typenum[0]++;
                    tail++;
                    length++;
                }
                else {
                    typenum[1]++;
                    tail++;
                    length++;
                }
            } else if (type2==-1){
                if (type1!=fruits[tail]){
                    type2=fruits[tail];
                    typenum[1]++;
                    tail++;
                    length++;
                } else{
                    typenum[0]++;
                    tail++;
                    length++;
                }
            } else {
                if (fruits[tail]==type1){
                    typenum[0]++;
                    tail++;
                    length++;
                } else if (fruits[tail]==type2){
                    typenum[1]++;
                    tail++;
                    length++;
                } else {
                    if (fruits[head]==type1){
                        typenum[0]--;
                        if (typenum[0]==0)
                            type1=-1;
                    } else {
                        typenum[1]--;
                        if (typenum[1]==0)
                            type2=-1;
                    }
                    if (length>=ans)
                        ans=length;
                    head++;
                    length--;
                }
            }
        }
        ans=(length>=ans)?length:ans;
        return ans;
    }
}
