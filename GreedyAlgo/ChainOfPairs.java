package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class ChainOfPairs {
    public static void main(String[] args){
        int[][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        int chain = 0;
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        for(int i =0 ; i < pairs.length-1; i++){
            if(pairs[i][0] <= pairs[i+1][1]){
                chain++;
            }
        }
        System.out.println(chain);
    }
}
