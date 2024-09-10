package BasicDSA.Backtracking;

import BasicDSA.Array.printer;

public class RatMaze{
    public static int count = 0;
    public static boolean isSafe(int maze[][], int row, int col){
        
        if(maze[row][col] == -1){
            return false;
        }
        return true;
    }
    public static void pathfinder(int maze[][],int solved[][], int row, int col){
        //base 
        if(row == maze.length-1 && col == maze.length-1){
            solved[row][col] = 1;
            System.out.println("---------------------"+count+"-------------------------");
            printer.print(solved);
            count++;
            return;
        }
        if(row > maze.length-1){
            return;
        }
        else if(col > maze[0].length-1){
            return;
        }
        else if(row < 0){
            return;
        }
        else if(col < 0){
            return;
        }

        //recursion
        if(isSafe(maze,row,col)){
            solved[row][col] = 1;
        }
        pathfinder(maze, solved, row+1, col);
        pathfinder(maze, solved, row, col+1);
        solved[row][col] = 0;
    }
    public static void main(String[] args){
        int maze[][] = {{0,0,0,0},{-1,0,-1,0},{0,0,0,0},{0,-1,0,0}};
        int solved[][] = new int[4][4];
        pathfinder(maze,solved,0,0);
        System.out.println("Number of solutions : "+count);
    }
}