package 字符串.替换空格;

public class Offer05 {
    public String replaceSpace(String s) {
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' ')
                ans=ans+"%20";
            else
                ans=ans+s.charAt(i);
        }
        return ans;
    }
}
