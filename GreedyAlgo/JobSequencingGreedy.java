package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingGreedy {
    public static class Job{
        int idx;
        int deadline;
        int profit;
        public Job(int i,int d,int p){
            this.idx = i;
            this.deadline = d;
            this.profit = p;
        }
    }
    public static void main(String[] args){
        int[][] jobsInfo = {{1, 4, 20}, {2, 1, 10}, {3, 1, 40}, {4, 1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i = 0; i < jobsInfo.length; i++){
            jobs.add(new Job(jobsInfo[i][0], jobsInfo[i][1], jobsInfo[i][2]));
        }
        Collections.sort(jobs, (a,b)->b.profit-a.profit); //sorting in descending order for objects using lemda function
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0, maxProfit = 0;
        for(int i = 0; i < jobs.size(); i++){
            if(time < jobs.get(i).deadline){
                time+=jobs.get(i).deadline;
                seq.add(jobs.get(i).idx);
                maxProfit += jobs.get(i).profit;
            }
        }
        System.out.print("Profit : "+maxProfit+"\nSeqence is : ");
        for(int i = 0; i < seq.size(); i++){
            System.out.print(" "+seq.get(i)+" ");
        }
        System.out.println();

        
    }
}
