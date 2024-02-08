package 哈希表.赎金信;

/**
 * @author zx
 * @date 2024/2/7 13:26
 */
public class Quiz383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rl = ransomNote.length(), ml = magazine.length();
        if (rl > ml)
            return false;
        int[] moccurs = new int[26];
        for (int i = 0; i < ml; i++) {
            moccurs[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < rl; i++) {
            if (moccurs[ransomNote.charAt(i) - 'a'] == 0)
                return false;
            moccurs[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
