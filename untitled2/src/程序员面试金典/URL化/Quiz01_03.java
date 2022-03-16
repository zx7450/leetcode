package 程序员面试金典.URL化;

/**
 * @author zx
 * @date 2022/3/16 9:52
 */
public class Quiz01_03 {
//    public String replaceSpaces(String S, int length) {
//        StringBuilder stringBuilder=new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            char c=S.charAt(i);
//            if (c!=' ')
//                stringBuilder.append(c);
//            else
//                stringBuilder.append("%20");
//        }
//        return stringBuilder.toString();
//    }

//    public String replaceSpaces(String S, int length) {
//        return S.substring(0,length).replace(" ","%20");
//    }

    public String replaceSpaces(String S, int length) {
        char[] chars=S.toCharArray();
        int index=chars.length-1;
        for (int i=length-1;i>=0;i--) {
            if (chars[i]==' ') {
                chars[index--]='0';
                chars[index--]='2';
                chars[index--]='%';
            } else
                chars[index--]=chars[i];
        }
        return new String(chars,index+1,chars.length-index-1);
    }
}
