package _10_recursion.Class.Recursion_10.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintPath2D {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] paths = new int[maze.length][maze[0].length];

        printPathList("", paths, 1, maze, 0, 0);
    }

    public static void printPathList(String p, int[][] paths, int flag, boolean[][] maze, int r, int c){

        if (r == maze.length - 1 && c == maze[0].length - 1){
            // Set the value to last cell
            paths[r][c] = flag;

            for (int[] path : paths){
                System.out.print("[");
                for (int f : path) {
                    System.out.print(f +" ");
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println();

            System.out.println(p);
            System.out.println();
            return;
        }

        // Turn the current cell to false. Because if it is going to be false then there is no way to go
        // that direction
        maze[r][c] = false;
        paths[r][c] = flag;

        // To go up
        if (r > 0 && maze[r - 1][c]){
            printPathList(p + "U",paths, flag + 1, maze,r - 1, c);
        }

        // To go down
        if (r < maze.length - 1 && maze[r + 1][c]){
            printPathList(p + "D", paths, flag + 1, maze,r + 1, c);
        }


        // To go left
        if (c > 0 && maze[r][c - 1]){
            printPathList(p + "L", paths, flag + 1, maze, r, c - 1);
        }

        // To go right
        if (c < maze[0].length - 1 && maze[r][c + 1]){
            printPathList(p + "R" , paths, flag + 1, maze, r, c + 1);
        }

        maze[r][c] = true;
        paths[r][c] = 0;
    }
}
