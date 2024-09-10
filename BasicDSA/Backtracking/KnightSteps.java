package BasicDSA.Backtracking;

import BasicDSA.Array.printer;

public class KnightSteps {
    public static int steps = 0;
    // public static boolean isSafe(int board[][], int row, int col){

    // return true;
    // }
    public static void knightTraversal(int board[][], int row, int col) {
        // base
        int n = board.length - 1;
        if (steps >= (n * n)) {
            return;
        } else if (row > board.length - 1 || col > board[0].length - 1) {
            return;
        } else if (row < 0 || col < 0) {
            return;
        } else if (board[row][col] != -1) {
            return;
        }

        // recursion

        board[row][col] = steps;

        steps++;
        knightTraversal(board, row + 2, col + 1);
        knightTraversal(board, row + 2, col - 1);
        knightTraversal(board, row - 2, col + 1);
        knightTraversal(board, row - 2, col - 1);
        knightTraversal(board, row + 1, col + 2);
        knightTraversal(board, row + 1, col - 2);
        knightTraversal(board, row - 1, col + 2);
        knightTraversal(board, row - 1, col - 2);
        steps--;
        
    }

    public static void main(String[] args) {
        int n = 8;
        int board[][] = new int[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = -1;
            }
        }
        knightTraversal(board, 0, 0);
        System.out.println("========================================");
        printer.print(board);
    }
}
