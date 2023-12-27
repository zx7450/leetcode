package 每日一题.保龄球游戏的获胜者;

/**
 * @author zx
 * @date 2023/12/27 8:53
 */
public class Quiz2660 {
    public int isWinner(int[] player1, int[] player2) {
        int n = player1.length;
        if (n == 1) {
            return player1[0] > player2[0] ? 1 : (player1[0] == player2[0] ? 0 : 2);
        }
        int tenpos = -1;
        int score1 = 0;
        int score2 = 0;
        for (int i = 0; i < n; i++) {
            if (tenpos != -1 && i - tenpos <= 2)
                score1 += 2 * player1[i];
            else
                score1 += player1[i];
            if (player1[i] == 10)
                tenpos = i;
        }
        tenpos = -1;
        for (int i = 0; i < n; i++) {
            if (tenpos != -1 && i - tenpos <= 2)
                score2 += 2 * player2[i];
            else
                score2 += player2[i];
            if (player2[i] == 10)
                tenpos = i;
        }
        return score1 > score2 ? 1 : (score1 == score2 ? 0 : 2);
    }
}
