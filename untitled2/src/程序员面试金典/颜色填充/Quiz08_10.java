package 程序员面试金典.颜色填充;

/**
 * @author zx
 * @date 2022/4/23 10:22
 */
public class Quiz08_10 {
    boolean[][] visit;
    int rowlen;
    int collen;
    int oldColor;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        rowlen = image.length;
        collen = image[0].length;
        visit = new boolean[rowlen][collen];
        oldColor = image[sr][sc];
        backtracing(image, sr, sc, newColor);
        return image;
    }

    public void backtracing(int[][] image, int sr, int sc, int newColor) {
        if (sr < 0 || sr == rowlen || sc < 0 || sc == collen || visit[sr][sc] || image[sr][sc] != oldColor)
            return;
        visit[sr][sc] = true;
        image[sr][sc] = newColor;
        backtracing(image, sr + 1, sc, newColor);
        backtracing(image, sr - 1, sc, newColor);
        backtracing(image, sr, sc + 1, newColor);
        backtracing(image, sr, sc - 1, newColor);
    }
}
