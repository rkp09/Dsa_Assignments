package _10_recursion.Class.Recursion_10.Maze;

import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] obstacles = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        System.out.println(printPathList("", obstacles, 0, 0));
    }


    public static List<String> printPathList(String p, boolean[][] obstacle, int r, int c){

        if (r == obstacle.length - 1 && c == obstacle[0].length - 1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if (!obstacle[r][c]){
            List<String> list = new ArrayList<>();
            return list;
        }

        List<String> list = new ArrayList<>();

        if (r < obstacle.length - 1){
            list.addAll(printPathList(p + "D",obstacle,r + 1, c));
        }

        if (r < obstacle.length - 1 && c < obstacle[0].length - 1){
            list.addAll(printPathList(p + "A", obstacle,r + 1, c + 1));
        }
        if (c < obstacle[0].length - 1){
            list.addAll(printPathList(p + "R" , obstacle, r, c + 1));
        }

        return list;

    }
}
