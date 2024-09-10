package BasicDSA.Array.Matrix;

import java.util.Scanner;

import BasicDSA.Array.printer;

public class SearchMatrix {
    public static Scanner sc = new Scanner(System.in);
    public static void Lsearch(int matrix[][], int target){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
                    System.out.println("Found at index : ("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.println("Not found!");
    } 
    public static void Bsearch(int matrix[][], int target){
        int row =0, col = matrix[0].length-1; 
        while(row <= matrix.length-1){
            if(matrix[row][col] == target){
                System.out.println("Found at index : ("+row+","+col+")");
                return;
            }
            if(target > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("Not found!");
    }
    public static void main(String args[]){
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Original : ");
        printer.print(matrix);
        System.out.println("Enter element you want to search : ");
        int target = sc.nextInt();
        //Lsearch(matrix, target);
        Bsearch(matrix,target);
    }
}
