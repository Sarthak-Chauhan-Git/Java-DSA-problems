package BasicDSA.Array;

import java.util.*;

public class SubArray {
    public static Scanner sc = new Scanner(System.in);

    // BRUTE FORCE O(n^3)
    public static void subArray(int num[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum = sum + num[k];
                }
                if (sum > max) {
                    max = sum;
                }
                System.out.print("]");
                System.out.print(": " + sum + " , ");
            }
            System.out.println();
        }
        System.out.println("Highest possible subarray sum is : " + max);
    }

    // PREFIX ARRAY O(n^2)
    public static void SubArrayPrefix(int num[]) {
        int curr, max=Integer.MIN_VALUE;
        int[] prefix = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            prefix[i] = i==0? num[i]:prefix[i-1]+num[i];
        }
        for (int i = 0; i < prefix.length; i++) {
            for(int j = i; j<prefix.length; j++){
                curr = i==0? prefix[j]:prefix[j]-prefix[i-1];
                if(curr>max){
                    max = curr;
                }
            }
        }
        System.out.println("Highest possible subarray sum is : " + max);
    }

    //KADANE'S ALGORITHM    O(n)
    public static void SubArrayKadane(int num[]){
        int curr=0, max=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(curr+num[i]>0){
                curr = curr+num[i];
            }
            if(curr>max){
                max = curr;
            }
        }
        System.out.println("Highest possible subarray sum is : " + max);
    }

    public static void main(String args[]) {
        // int num[] = { 2, 4, 6, 8, 10 };
        // int num[] = { 1, -2, 6, -1, 3 };
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // subArray(num);
        // SubArrayPrefix(num);
        SubArrayKadane(num);
    }
}
