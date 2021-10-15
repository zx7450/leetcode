package 哈希表.有效的字母异位词;

import java.util.HashMap;

public class Quiz383 {
    public boolean canConstruct(String ransomNote, String magazine) {//题中只含有小写，用数组代替hashmap
        int ranlen=ransomNote.length();
        int maglen=magazine.length();
        if (ranlen>maglen)
            return false;
        int[] chnum=new int[26];//代表magazine数组中字母的出现次数
        for (int i = 0; i < maglen; i++) {
            char ch=magazine.charAt(i);
            chnum[ch-'a']++;
        }
        for (int i = 0; i < ranlen; i++) {
            char ch=ransomNote.charAt(i);
            chnum[ch-'a']--;
            if (chnum[ch-'a']<0)
                return false;
        }
        return true;
    }
}
