package BasicDSA.Array.Matrix;

import BasicDSA.Array.printer;


public class DiagonalSum {
    public static int NxNsum(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }

            }
        }

        return sum;
    }

    public static int Nsum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];    //primary diagonal
            if (i != matrix.length - 1 - i) {   //middle element skip
                int j = (matrix.length - 1) - i;    //j calculation 
                sum += matrix[i][j];    //secondary diagonal
            }
        }

        return sum;
    }

    public static void main(String atgs[]) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Original : ");
        printer.print(matrix);
        System.out.println("Sum is : " + Nsum(matrix));
    }
}
