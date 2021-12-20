package 算法学习计划.算法入门.第七天广度优先深度优先.图像渲染;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2021/12/20 9:19
 */
public class Quiz733 {
//    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {//深度优先
//        int oldColor=image[sr][sc];
//        if (oldColor!=newColor)
//            changeColor(image,sr,sc,newColor,oldColor);
//        return image;
//    }
//    public void changeColor(int[][] image, int sr, int sc, int newColor,int oldColor) {
//        if (sr<0||sr>= image.length||sc<0||sc>=image[0].length||image[sr][sc]!=oldColor)
//            return;
//        image[sr][sc]=newColor;
//        changeColor(image,sr-1,sc,newColor,oldColor);
//        changeColor(image,sr,sc-1,newColor,oldColor);
//        changeColor(image,sr,sc+1,newColor,oldColor);
//        changeColor(image,sr+1,sc,newColor,oldColor);
//    }
    int[] dx={1,0,0,-1};
    int[] dy={0,1,-1,0};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {//广度优先
        int oldColor=image[sr][sc];
        if (oldColor==newColor)
            return image;
        Queue<int[]> queue=new LinkedList<int[]>();
        queue.offer(new int[]{sr,sc});
        image[sr][sc]=newColor;
        int rowlen=image.length;
        int collen=image[0].length;
        while (!queue.isEmpty()) {
            int[] cell=queue.poll();
            int x=cell[0],y=cell[1];
            for (int i = 0; i < 4; i++) {
                int mx=x+dx[i],my=y+dy[i];
                if (mx>=0&&mx<rowlen&&my>=0&&my<collen&&image[mx][my]==oldColor) {
                    queue.offer(new int[]{mx,my});
                    image[mx][my]=newColor;
                }
            }
        }
        return image;
    }
}
