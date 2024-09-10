package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class FractionKnapsack {
    public static void main(String[] args) {
        int[] value = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };
        int[][] data = new int[value.length][4];
        int profit = 0;
        int capacity = 50;
        for (int i = 0; i < value.length; i++) {
            data[i][0] = i;
            data[i][1] = value[i];
            data[i][2] = weight[i];
            data[i][3] = value[i] / weight[i];
        }
        Arrays.sort(data, Comparator.comparingDouble(o -> o[3]));
        for (int i = value.length-1; i >= 0; i--) {
            // System.out.println("Cap "+capacity);
            // System.out.println("Pro "+profit);
            if(capacity >= data[i][2]){ //weight
                profit += data[i][1];
                capacity = capacity - data[i][2];
            }
            else{
                profit = profit + (data[i][3]*capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(profit);
        System.out.println(capacity);
    }
}
