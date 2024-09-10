package GreedyAlgo;

import java.util.Arrays;

public class MinAbsoluteDiff {
    public static void main(String[] args){
        int[] A = {4,1,8,7};
        int[] B = {2,3,6,5};
        Arrays.sort(A);
        Arrays.sort(B);
        
        int diff = 0;
        for(int i = A.length-1; i>=0; i--){
            diff = diff + Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum absolute difference  : "+diff);
    }
}
