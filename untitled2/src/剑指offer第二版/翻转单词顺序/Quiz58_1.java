package 剑指offer第二版.翻转单词顺序;

/**
 * @author zx
 * @date 2022/3/9 9:30
 */
public class Quiz58_1 {
//    public String reverseWords(String s) {//双指针法
//        s=s.trim();//删除首尾空格
//        int r=s.length()-1,l=r;
//        StringBuilder stringBuilder=new StringBuilder();
//        while (l>=0) {
//            while (l>=0&&s.charAt(l)!=' ')//搜索首个空格
//                l--;
//            stringBuilder.append(s.substring(l+1,r+1)+" ");
//            while (l>=0&&s.charAt(l)==' ')//删除单词间的空格
//                l--;
//            r=l;
//        }
//        return stringBuilder.toString().trim();
//    }

    public String reverseWords(String s) {//库函数法
        String[] strs=s.trim().split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=strs.length-1;i>=0;i--) {
            if (strs[i].equals(""))//Java若存在多余空格分割后会多出空单词（“”），遇到此情况直接跳过
                continue;
            stringBuilder.append(strs[i]+" ");
        }
        return stringBuilder.toString().trim();
    }
}
