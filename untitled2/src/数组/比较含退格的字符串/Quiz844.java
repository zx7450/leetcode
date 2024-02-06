package 数组.比较含退格的字符串;

/**
 * @author zx
 * @date 2024/2/2 11:36
 */
public class Quiz844 {
    public boolean backspaceCompare(String s, String t) {
        int spos = s.length() - 1, tpos = t.length() - 1, sdel = 0, tdel = 0;
        while (spos >= 0 || tpos >= 0) {
            while (spos >= 0) {
                if (s.charAt(spos) == '#') {
                    sdel++;
                    spos--;
                } else if (sdel > 0) {
                    spos--;
                    sdel--;
                } else break;
            }
            while (tpos >= 0) {
                if (t.charAt(tpos) == '#') {
                    tdel++;
                    tpos--;
                } else if (tdel > 0) {
                    tpos--;
                    tdel--;
                } else break;
            }
            if (spos >= 0 && tpos >= 0) {
                if (s.charAt(spos) == t.charAt(tpos)) {
                    spos--;
                    tpos--;
                    continue;
                } else
                    return false;
            } else if (spos >= 0 || tpos >= 0)
                return false;
        }
        return true;
    }
}
