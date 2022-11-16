package _10_recursion.Class.Recursion_10.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] path = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        System.out.println(printPathList("", path, 0, 0));
    }

    public static List<String> printPathList(String p, boolean[][] path, int r, int c){

        if (r == path.length - 1 && c == path[0].length - 1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();
        // Turn the current cell to false. Because if it is going to be false then there is no way to go
        // that direction
        path[r][c] = false;

        // To go up
        if (r > 0 && path[r - 1][c]){
            list.addAll(printPathList(p + "U",path,r - 1, c));
        }

        // To go down
        if (r < path.length - 1 && path[r + 1][c]){
            list.addAll(printPathList(p + "D", path,r + 1, c));
        }


        // To go left
        if (c > 0 && path[r][c - 1]){
            list.addAll(printPathList(p + "L", path, r, c - 1));
        }

        // To go right
        if (c < path[0].length - 1 && path[r][c + 1]){
            list.addAll(printPathList(p + "R" , path, r, c + 1));
        }

        path[r][c] = true;
        return list;
    }
}
