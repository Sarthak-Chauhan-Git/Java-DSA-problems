package BasicDSA.Array;

import java.util.*;

public class printer {
    public static void print(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
            System.out.println();
    }

    public static void print(String matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void print(char matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void print(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" -> ");
        }
        System.out.println("NULL");
    }
    
}
