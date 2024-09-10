package BasicDSA.Backtracking;

import BasicDSA.Array.printer;

public class nQueenProblem {
    public static int count = 0;
    public static boolean isSafe(char board[][], int row, int col){
        //vertically up
        for(int i=0; i<row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonally up
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j<board[0].length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static void nQueen(char board[][], int row) {
        if(row >= board.length){
            System.out.println("------------------------------");
            printer.print(board);
            count++;
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board,row,col)) {
                board[row][col] = 'Q';
                nQueen(board, row + 1);
                board[row][col] = '.';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }
        nQueen(board, 0);
        System.out.println("Count is : "+count);
    }

}
