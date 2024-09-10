package BasicDSA.Array.Matrix;

import BasicDSA.Array.printer;
import BasicDSA.Sorting.Insertionsort;

public class SortMatrix {
    public static int[][] sort(int matrix[][]){
        int sorted[][] = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            int sortedArr[] = Insertionsort.sort(matrix[i]);
            sorted[i] = sortedArr;
        }
        return sorted;
    }
    public static void main(String args[]){
        int matrix[][] = {{2,3,4},{1,7,5},{6,9,8}};
        System.out.println("Original : ");
        printer.print(matrix);
        int sorted[][] = sort(matrix);
        System.out.println("Sorted : ");
        printer.print(sorted);
    }
}
