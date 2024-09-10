package BasicDSA.Array;

import java.util.Scanner;

public class TrappingRainwater {
    Scanner sc = new Scanner(System.in);
    public static int maxLeft(int height[], int i){
        int max=Integer.MIN_VALUE;
        for(int j=i; j>=0; j--){
            if(height[j]>max)max=height[j];
        }
        return max;
    }

    public static int maxRight(int height[], int i){
        int max = Integer.MIN_VALUE;
        for(int j=i; j<height.length; j++){
            if(height[j]>max)max=height[j];
        }
        return max;
    }
    public static int[] Rainwater(int height[]){
        int sol[] = new int[height.length];
        for(int i=0; i<height.length; i++){
            int ml = maxLeft(height,i);
            int rl = maxRight(height,i); 
            int wl = ml > rl? rl:ml;
            sol[i] = (wl-height[i]);
        }
        return sol;
    }
    public static void main(String args[]){
        int height[] = {4, 2, 0, 3, 2, 5};
        int sol[] = Rainwater(height);
        int sum=0;
        System.out.println("Water stored at each bar is : ");
        for(int i=0; i<sol.length; i++){
            System.out.print(sol[i]);
            sum+=sol[i];
        }
        System.out.println("\nTotal water stored is : "+sum);
    }
}
