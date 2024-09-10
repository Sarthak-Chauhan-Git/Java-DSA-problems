package BasicDSA.Array.Matrix;

import java.util.*;

import BasicDSA.Array.printer;

public class Matrixspiral {
    public static Scanner sc = new Scanner(System.in);

    public static void spiral(int[][] matrix) {
        int n = matrix.length;
        int m = matrix.length;
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = m - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // top
            for (int j = colStart; j <= colEnd; j++) {
                System.out.print(matrix[rowStart][j]);
            }
           

            // left
            for (int i = rowStart+1; i <= rowEnd; i++) {
                if(colStart == colEnd){
                    break;
                }
                System.out.print(matrix[i][colEnd]);
            }

            // bottom
            for (int j = colEnd-1; j >= colStart; j--) {
                if(rowStart == rowEnd){
                    break;
                }
                System.out.print(matrix[rowEnd][j]);
            }
            
            // right
            for (int i = rowEnd-1; i >= rowStart; i--) {
                System.out.print(matrix[i][colStart]);
            }
           

            rowEnd--;
            rowStart++;
            colEnd--;
            colStart++;
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Original : ");
        printer.print(matrix);
        System.out.println("Spiral matrix : ");
        spiral(matrix);
    }
}
