package BasicDSA.Array.Matrix;

import BasicDSA.Array.printer;

public class TransposeMatrix {
    public static void transpose(String matrix[][]) {
        int row = 0, col = 0;
        int transRow = matrix[0].length, transCol = matrix.length;
        String trans[][] = new String[transRow][transCol];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++, row++) {
                if (row > trans.length - 1) {
                    row = 0;
                    col++;
                }
                trans[row][col] = matrix[i][j];
            }
        }

        // printer
        // for(int i =0; i<trans.length; i++){
        // for(int j = 0; j<trans[0].length; j++){
        // System.out.print(trans[i][j]+" ");
        // }
        // System.out.println();
        // }
        printer.print(trans);

    }

    public static void main(String args[]) {
        String matrix[][] = { { "a11", "a12", "a13" }, { "a21", "a22", "a23" }, { "a31", "a32", "a33" },
                { "a41", "a42", "a43" } };
        // printer
        System.out.println("Original :");
        printer.print(matrix);
        System.out.println("\nTransposed : ");
        transpose(matrix);
    }
}
