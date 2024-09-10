//IMPORTANT
package GreedyAlgo;

import java.util.*;

public class ActivitySel {
    public static void main(String[] args){
        int start[] = {1,3,0,5,8,5}; 
        int end[] = {2,4,6,7,9,9}; 

        ArrayList<Integer> ans = new ArrayList<>();
        
        //creating 2D array of data and storing it together
        int acitivities[][] = new int[start.length][3]; 
        for(int i =0; i<start.length;i++){
            acitivities[i][0] = i;              //original index
            acitivities[i][1] = start[i];       //start
            acitivities[i][2] = end[i];         //end
        }

        //Sort 2D array using comparator on the basis of end[]
        Arrays.sort(acitivities, Comparator.comparingDouble(o -> o[2]));
        int maxAct = 1;                         //activity count initialized with 1 as first activity will be always done
        int lastEnd = acitivities[0][2];        //storing end time of curr activity
        ans.add(acitivities[0][0]);             //adding first activity index to ans arraylist
        for(int i =0; i< start.length; i++){
            if(lastEnd<=acitivities[i][1]){     //checking for curr activity to end and then start new activity
                maxAct++;
                ans.add(acitivities[i][0]);
                lastEnd = acitivities[i][2];
            }
        }

        System.out.println("Max activity : "+maxAct);
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
